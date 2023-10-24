package org.example.hackerrank;

/**
 A manufacturing company is located in a certain city.
 Their goods need to be shipped to other cities that are connected with bidirectional roads,
 though some cities may not be accessible because roads don't connect to them.
 The order of deliveries is determined first by distance, then by priority.
 Given the number of cities, their connections via roads, and what city the manufacturing company is located in,
 determine the order of cities where the goods will be delivered.
 For example, let's say that the number of cities is
 cityNodes = 4, where cityFrom = [1, 2, 2], cityTo =
 [2, 3, 4], and company = 1. In other words, the
 manufacturing company is located in city 1,
 and the roads run between cities 1 and 2, cities 2 and 3, and cities 2 and 4, like so:

 In this case, the cities would be visited based on the following logic:
 • The closest city (or cities) is visited first. This is city 2, which is 1 unit from the manufacturing company.
 • The next-closest city (or cities) is visited next.
 This is city 3 and city 4, which are both 2 units from the manufacturing company.
 • In this case, priority is then calculated, visiting the smaller-numbered city first (city
 3) and continuing in ascending order (city
 4).
 Therefore, the order is [2, 3, 4], which is the answer you would return.
 Function Description
 Complete the function order in theleditor below.
 Language Java 7
 order has the following parameters: int cityNodes: the number of cities
 int cityFrom[n]: the first city node where there is a bidirectional edge
 int cityTo[n]: the second city node where there is a bidirectional edge
 int company: the node where the route starts
 Returns:
 int[]: the cities where the goods will be delivered in the order visited
 Sample Input For Custom Testing
 STDIN
 Function
 5 5
 1 2
 1 3
 2 4
 3 5
 1 5
 1
 cityNodes = 5, n = 5
 cityFrom = 1, cityTo = 2
 cityFrom = 1, cityTo = 3
 cityFrom = 2, cityTo = 4
 cityFrom = 3, cityTo = 5
 cityFrom = 1, cityTo = 5
 company = 1
 Sample Output
 2
 3
 5
 4
 public static List‹Integer> order (int cityNodes.List<ints
 whistsInteger cityErom..5i
 „List‹Integer>
 cityTormint company)
 */
public class DeliveryManagementSystem {
}
