/*
 *    __   __  _                    _        __               
 *    \ \ / / (_)                  | |       \_\              
 *     \ V /   _   _ __       ___  | |__     __ _    ___      
 *      > <   | | | '_ \     / __| | '_ \   / _` |  / _ \     
 *     / . \  | | | | | |   | (__  | | | | | (_| | | (_) |    
 *    /_/_\_\ |_| |_| |_|    \___| |_| |_|  \__,_|  \___/ 
 * 
 *   
 *    |_   _| ( )               \ \    / / (_)         | |    
 *      | |   |/   _ __ ___      \ \  / /   _   _ __   | |__  
 *      | |       | '_ ` _ \      \ \/ /   | | | '_ \  | '_ \ 
 *     _| |_      | | | | | |      \  /    | | | | | | | | | |
 *    |_____|     |_| |_| |_|       \/     |_| |_| |_| |_| |_|
 */
package students_manager_form;


interface itf {
    public void nhap();
    public void xuat();
}
/**
 *
 * @author vnncv
 */
public abstract class Test implements itf{
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
