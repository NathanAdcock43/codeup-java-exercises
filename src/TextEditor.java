//    Setup: Create an interface named TextEditor.

public interface TextEditor {

//    1) This interface should specify an instance method "named openTextFile"
//    that "accepts one String" argument "named filename" and returns a String.

        String openTextFile (String filename);

//    2)Change your Device class so that it implements the TextEditor interface.

//    Done in the (Device Class)
//
//    The implementation of the openTextFile method on Device class should return a String with this message:
//    Opening $FILE with $EDITOR
//    Replace $FILE with the name of the file that was passed to the method.
//
//    $EDITOR should be replaced with either TextEdit or Notepad. Use the value of the instance property brand
//    to replace $EDITOR with either TextEdit if brand is equals to Apple or Notepad if brand is equals to Microsoft.
//
//    An example of the returned string if the brand is Microsoft might look like this:
//
//    Opening contacts.txt with Notepad


}
