/**
 * e-commerce-rest-scala
 *
 * Copyright 2015 juanitodread
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package models

import play.api.libs.json.Json

/**
 * Product case class
 *
 * @author juanitodread
 * @version 1.0.0
 * @since   1.0.0
 * 
 * 	        Oct 25, 2015
 */
case class Product( id: String, name: String, price: Double )

/**
 * Singleton for Product case class
 *
 * @author juanitodread
 * @version 1.0.0
 * @since   1.0.0
 * 
 * 	        Oct 25, 2015
 */
object Product {

  implicit val productWrites = Json.writes[ Product ]

  implicit val productReads = Json.reads[ Product ]

}