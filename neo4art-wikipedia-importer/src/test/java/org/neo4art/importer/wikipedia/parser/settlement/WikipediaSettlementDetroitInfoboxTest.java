package org.neo4art.importer.wikipedia.parser.settlement;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;
import org.neo4art.domain.Settlement;
import org.neo4art.importer.wikipedia.parser.settlement.WikipediaSettlementInfoboxParser;

public class WikipediaSettlementDetroitInfoboxTest {

	private static String INFOBOX ="{{Infobox settlement\n"+
		"| name                    = Detroit\n"+
		"| settlement_type         = [[City (Michigan)|City]]\n"+
		"| official_name           = City of Detroit\n"+
		"| latd  =  42 \n"+
		"| latm  = 19 \n"+
		"| lats  = 53 \n"+
		"| latNS  = N\n"+
		"| longd = 083 \n"+
		"| longm = 02 \n"+
		"| longs = 45 \n"+
		"| longEW = W\n"+
		"| website = [http://www.detroitmi.gov/ DetroitMI.gov]\n"+
		"}}";
		
	@Test
	public void shoudParseSettlement() throws MalformedURLException{
		Settlement settlement = WikipediaSettlementInfoboxParser.parse(INFOBOX);
		
		Assert.assertEquals("Detroit", settlement.getName());
		Assert.assertEquals("City (Michigan) City", settlement.getSettlementType());
		Assert.assertEquals("City of Detroit", settlement.getOfficialName());
		Assert.assertEquals("42.0",""+settlement.getCoordinate().getLatD());
		Assert.assertEquals("19.0", ""+settlement.getCoordinate().getLatM());
		Assert.assertEquals("53.0", ""+settlement.getCoordinate().getLatS());
		Assert.assertEquals("N", settlement.getCoordinate().getLatNS());
		Assert.assertEquals("83.0", ""+settlement.getCoordinate().getLongD());
		Assert.assertEquals("2.0", ""+settlement.getCoordinate().getLongM());
		Assert.assertEquals("45.0", ""+settlement.getCoordinate().getLongS());
		Assert.assertEquals("W", settlement.getCoordinate().getLongEW());
		Assert.assertEquals("http://www.detroitmi.gov/", settlement.getWebsite());
		Assert.assertEquals("settlement", settlement.getType());
	}
}
