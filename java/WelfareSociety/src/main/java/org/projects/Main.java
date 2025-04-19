package org.projects;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of agents: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Agent> agents = new ArrayList<>();

        // Accepting agent details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter agent name and fund generated (comma separated): ");
            String input = sc.nextLine();
            String[] agentData = input.split(",");
            String name = agentData[0].trim();
            long fundGenerated = Long.parseLong(agentData[1].trim());

            agents.add(new Agent(name, fundGenerated));
        }

        // Using Stream API to classify agents by their rating
        Map<String, String> agentRatings = agents.stream()
                .filter(agent -> agent.getGeneratedFund() >= 1000000)  // Filtering agents with fund >= 10 lakh
                .collect(Collectors.toMap(
                        Agent::getName,
                        agent -> {
                            long fund = agent.getGeneratedFund();
                            if (fund >= 2000000) {
                                return "***** (5 Star)";
                            } else if (fund >= 1500000) {
                                return "*** (3 Star)";
                            } else {
                                return "* (1 Star)";
                            }
                        }
                ));

        System.out.println("\nAgent Ratings:");
        agentRatings.forEach((name, rating) -> {
            System.out.println(name + " -> " + rating);
        });

    }
}