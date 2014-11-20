package fr.treeptik.xmlruntime;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import fr.treeptik.xml.CatalogueXML;
import fr.treeptik.xml.VoitureXML;

public class TestXml {

	public static void main(String[] args) throws Exception {
		System.out.println("******* JAXB ***********************");
		JAXBContext context = JAXBContext.newInstance(CatalogueXML.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		CatalogueXML catalogueXML = (CatalogueXML) unmarshaller
				.unmarshal(new File("catalogue.xml"));
		System.out.println("raison sociel :" + catalogueXML.getRaisonSociale());
		System.out
				.println("Nb voiture :" + catalogueXML.getVoitureXML().size());
		System.out.println("ecrire dans un fichier xml");
		/*VoitureXML voitureXml = new VoitureXML();
		voitureXml.setMarque("JAVA XML");
		voitureXml.setModele("BBB");
		catalogueXML.getVoitureXML().add(voitureXml);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(catalogueXML, new File("test.xml"));*/

		System.out.println("******* DOM XPATH ***********************");

		DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		Document xmlDocument = documentBuilder.parse(new File("test.xml"));

		XPath xPath = XPathFactory.newInstance().newXPath();
		// recherche 1 element
		String modelvoiture = xPath.compile(
				"//voitureXML[marque='JAVA XML']/modele").evaluate(xmlDocument);
		System.out.println(modelvoiture);
		// recherche +eurs elements
		NodeList nodelist = (NodeList) xPath.compile(
				"//voitureXML[marque='JAVA XML']/modele").evaluate(xmlDocument,
				XPathConstants.NODESET);
		for (int i = 0; i < nodelist.getLength(); i++) {
			System.out.println(nodelist.item(i).getTextContent());
		}
		
		
		DOMSource source = new DOMSource(xmlDocument);
		StreamResult streamResult = new StreamResult(new File("test2.xml")) ;
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer  = factory.newTransformer();
		transformer.transform(source, streamResult);
		
		
		
		
		
		
		
	}

}



















