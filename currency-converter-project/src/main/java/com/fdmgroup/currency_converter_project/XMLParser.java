package com.fdmgroup.currency_converter_project;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

public class XMLParser {

	private static Map<String, Double> converterMap = new HashMap<String, Double>();

	public Map<String, Double> getConverterMap() {
		return converterMap;
	}

	public void parserXML() {
		String url = "https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml";
		SAXBuilder builder = new SAXBuilder();
		try {
			Document document = builder.build(url);
			Element xmlfile = document.getRootElement();
			Namespace ns = Namespace.getNamespace("http://www.ecb.int/vocabulary/2002-08-01/eurofxref");
			// first get child gets to cube, second get child get to Cube time
			Element xmlfile2 = xmlfile.getChild("Cube", ns).getChild("Cube", ns);
			// Gets the whole list of cube with currency and rates
			List<Element> xmlfile3 = xmlfile2.getChildren("Cube", ns);

			for (Element e : xmlfile3) {
				String currency = e.getAttributeValue("currency");
				String rate = e.getAttributeValue("rate");
				// put the currency and rate into a map
				converterMap.put(currency, Double.parseDouble(rate));
			}
			System.out.println(converterMap);

		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
