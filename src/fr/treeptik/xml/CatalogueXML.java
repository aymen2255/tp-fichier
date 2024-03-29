//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.17 at 03:39:27 PM CEST 
//


package fr.treeptik.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="raisonSociale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDepot" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{}voitureXML" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "raisonSociale",
    "dateDepot",
    "voitureXML"
})
@XmlRootElement(name = "catalogueXML")
public class CatalogueXML {

    @XmlElement(required = true)
    protected String raisonSociale;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDepot;
    @XmlElement(required = true)
    protected List<VoitureXML> voitureXML;

    /**
     * Gets the value of the raisonSociale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisonSociale() {
        return raisonSociale;
    }

    /**
     * Sets the value of the raisonSociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisonSociale(String value) {
        this.raisonSociale = value;
    }

    /**
     * Gets the value of the dateDepot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDepot() {
        return dateDepot;
    }

    /**
     * Sets the value of the dateDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDepot(XMLGregorianCalendar value) {
        this.dateDepot = value;
    }

    /**
     * Gets the value of the voitureXML property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voitureXML property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoitureXML().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoitureXML }
     * 
     * 
     */
    public List<VoitureXML> getVoitureXML() {
        if (voitureXML == null) {
            voitureXML = new ArrayList<VoitureXML>();
        }
        return this.voitureXML;
    }

}
