package study.datajpa.repository;

public interface NestedColedPorjections {

    String getUsername();
    TeamInfo getTeam();

    interface  TeamInfo {
        String getName();
    }
}
