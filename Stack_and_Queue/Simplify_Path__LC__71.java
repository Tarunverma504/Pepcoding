package Stack_and_Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.

 

Example 1:

Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
Example 2:

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
Example 3:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
Example 4:

Input: path = "/a/./b/../../c/"
Output: "/c"
*/
import java.util.*;
public class Simplify_Path__LC__71 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/simplify-path/
        */
    }
    static class Solution {
        public String simplifyPath(String path) {
            String tokens[]=path.split("/");
            Stack<String> stack=new Stack<String>();
            for(String e:tokens){
                if(e.equals("..")){
                    if(!stack.isEmpty())
                        stack.pop();
                }
                else if (e.length()>0 && !e.equals(".")) {
                    stack.push(e);
                }
            }
            String sb ="";
            while(!stack.isEmpty()){
                sb="/"+stack.peek()+sb;
                stack.pop();
            }
            if(sb.length()>0){
                return sb.toString();
            }
            else
                return "/";
            //return "abc";
        }
    }
}
