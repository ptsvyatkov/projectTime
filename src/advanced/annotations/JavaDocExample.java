/**
 * @author self
 * @version 1.0.0
 * @since 2023
 */
package annotations;

/**
 * Class for Library Book
 */
class Book {
    static int val = 10;

    /**
     * @param s name of book
     **/
    @SuppressWarnings("unchecked")
    public Book(String s){

    }

    /**
     * @param num student identification number
     * @throws Exception Exception if book is not available
     **/
    public void issue(int num) throws Exception {

    }

    /**
     * Check if book is available
     * @param str name of book
     * @return is book available
     */
    public boolean available(String str){
        return true;
    }

    /**
     * @param id book id
     * @return name of book
     */
    public String getName(int id){
        return "";
    }

}

public class JavaDocExample {

    public static void main(String[] args) {

    }

}
