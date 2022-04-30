/**
 * Pro1_64011013
 */
// The U.S. Census Bureau projects population based on the following assumptions:
// ■ One birth every 7 seconds
// ■ One death every 13 seconds
// ■ One new immigrant every 45 seconds
// Write a program to display the population for each of the next five years. 
// Assume the current population is 312,032,486 and one year has 365 days. 

public class Pro1_64011013 {
    public static void main(String[] args) {
        long fiveyinsec = 31536000*5 ;
        long curPopulation = 312032486;
        long birth = fiveyinsec / 7;
        long death = fiveyinsec / 13;
        long immigrant = fiveyinsec / 45;
        curPopulation = curPopulation + birth  - death + immigrant ;
        System.out.println("The population in next five years is " + curPopulation);
    }
}