/**
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.neo4art.colour.manager;

import java.io.IOException;
import java.util.List;

import org.neo4art.colour.bean.ArtworkURL;
import org.neo4art.colour.domain.ColourAnalysis;
import org.neo4art.colour.exception.ImageParserException;
import org.neo4art.domain.Artist;

/**
 * @author Lorenzo Speranzoni
 * @since 2 May 2015
 */
public interface ArtworksColoursAnalyzer
{
  /**
   * @param fileName
   * @return
   * @throws IOException
   */
  List<ArtworkURL> loadArtworksURLsFromFile(String fileName) throws IOException;

  /**
   * @param artworksURLsFromFile
   * @return
   * @throws ImageParserException
   */
  List<ColourAnalysis> analyzeArtworksColours(List<ArtworkURL> artworksURLsFromFile) throws ImageParserException;
  
  /**
   * 
   * @param artist
   * @return
   */
  List<ColourAnalysis> getColourAnalysisByArtist(Artist artist);
}
