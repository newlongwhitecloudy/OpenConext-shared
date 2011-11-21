/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package nl.surfnet.coin.shared.service;

import org.opensocial.models.Person;

import java.util.List;

/**
 *
 */
public interface PersonService {
  /**
   * Get the OpenSocial Person
   *
   * @param userId the unique identifier
   * @param loggedInUser the unique identifier of the user that is going to make the request
   * @return the {@link org.opensocial.models.Person}
   */
  Person getPerson(String userId, String loggedInUser);

  /**
   * Get the group members of the given group.
   *
   * @param groupId {@link String} the unique identifier for the group
   * @param loggedInUser {@link String} the unique identifier for the logged in user
   * @return an {@link java.util.ArrayList} containing {@link Person}'s
   */
  List<Person> getPeople(String groupId, String loggedInUser);
}