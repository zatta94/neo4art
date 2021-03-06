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

package org.neo4art.sentiment.repository;

import org.neo4art.sentiment.domain.NLP;

/**
 * @author Lorenzo Speranzoni
 * @since 30 Apr 2015
 */
public interface NLPRepository
{

  /**
   * @param nlpNode
   * @return
   */
  Long addNode(NLP nlpNode);

  /**
   * @param previousNodeId
   * @param currentNodeId
   * @return
   */
  long addRelationshipToWord(Long previousNodeId, Long currentNodeId);

  /**
   * @param previousNodeId
   * @param currentNodeId
   * @return
   */
  long addRelationshipToPunctuation(Long previousNodeId, Long currentNodeId);

  /**
   * @param documentNodeId
   * @param nlpLinkedListStartingNodeId
   * @param nlpSentenceLength
   * @return
   */
  long addRelationshipBetweenOriginalDocumentAndNLPLinkedList(long documentNodeId, long nlpLinkedListStartingNodeId, int nlpSentenceLength);

}
