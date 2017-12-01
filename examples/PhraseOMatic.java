public class PhraseOMatic{
    public static void main (String []args){

//making a set of 3 strings to choose from. 
//This is an example of a String Array. Arrays start from 0 - whatever.
//This is just declaring a String of Arrays we will call from later. 
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","frontend","web-based","pervasive", "smart", "sixsigma","critical-path", "dynamic" };   
        String[] wordListTwo = {"empowered", "sticky","value-added", "oriented", "centric", "distributed","clustered", "branded","outside-the-box", "positioned","networked", "focused", "leveraged", "aligned","targeted", "shared", "cooperative", "accelerated"};    
        String[] wordListThree = {"process", "tippingpoint","solution", "architecture", "core competency","strategy", "mindshare", "portal", "space", "vision","paradigm", "mission"};

//find out how many words are in each list.
//Now from the created arrays, are asking to find the value (how many) words are in each string array. 
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

//generating three random numbers.
//Now we are using the random method, converting the words into integers. 
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

//now building a phrase 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

//print out the phrase
        System.out.println("what we need is a " + phrase);

    }

}