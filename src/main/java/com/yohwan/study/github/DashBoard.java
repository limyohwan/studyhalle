package com.yohwan.study.github;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class DashBoard {
    private Map<String, Integer> result = new HashMap<>();
    private GitHub gitHub;

    public DashBoard(GitHub gitHub) {
        this.gitHub = gitHub;
    }

    public static void main(String[] args) throws IOException {
        DashBoard dashBoard = new DashBoard(new GitHubBuilder().withPassword(GithubAuth.USER_ID, GithubAuth.PASSWORD).build());
        Map<String, Integer> result = dashBoard.getResult("limyohwan/studyhalle");

        for (String userId : result.keySet()) {
            System.out.println(userId + " : " + result.get(userId) + "회");
        }
    }

    public Map<String, Integer> getResult(String repositoryName) throws IOException {
        GHRepository studyhalle = getRepository(repositoryName);
        
        List<GHIssue> issues = studyhalle.getIssues(GHIssueState.ALL);

        calculateDashboardResult(issues);

        return this.result;
    }

    private GHRepository getRepository(String repositoryName) throws IOException {
        return this.gitHub.getRepository(repositoryName);//"limyohwan/studyhalle"
    }

    private void calculateDashboardResult(List<GHIssue> issues) throws IOException {
        for (GHIssue issue : issues) {
            calculateDashboardResultPerIssue(issue);
        }
    }

    private void calculateDashboardResultPerIssue(GHIssue issue) throws IOException {
        addCountPerParticipant(getParticipants(issue.getComments()));
    }

    private Set<String> getParticipants(List<GHIssueComment> comments) throws IOException {
        Set<String> participants = new HashSet<>();

        for (GHIssueComment comment : comments) {
            GHUser user = comment.getUser();
            participants.add(user.getName());
        }

        return participants;
    }

    private void addCountPerParticipant(Set<String> participants) {
        for (String participant : participants) {
            this.result.merge(participant, 1, Integer::sum);
        }
    }
}
