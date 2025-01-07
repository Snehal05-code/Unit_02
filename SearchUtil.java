// Define the main class SearchUtil
public class SearchUtil {
    //Main method
    public static void main(String[] args) {

    }
    // Declare an array of integers
    int arr[] = {30, 45, 66, 75, 44, 36};

    // Declare an integer variable to store the element to be searched
    int ele = 45;
    // Create an object of the SearchEle class
    SearchEle searchEle = new SearchEle();
    //Call the search method SearchEle
    int x = searchEle.search(arr, ele);
}
// class SearchEle used to perform method overloading
class SearchEle {
    // Public method to search for an element in the array
    public int search(int[] arr, int ele) {
        // Call the private overloaded search method
        return search(arr,ele,0);
    }
    // Private overloaded search method for additional parameter
    private int search(int[] arr,int ele,int i){
        // Return the element passed as input
        return ele;
    }

}


