package chat;


/**
* chat/ChatServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from chat.idl
* Wednesday, 13 February 2019 at 18:22:16 Greenwich Mean Time
*/

public interface ChatServerOperations 
{
  String subscribe (String name, chat.ChatClient c) throws chat.NameAlreadyUsed;
  void unsubscribe (String id) throws chat.UnknownID;
  void comment (String id, String text) throws chat.UnknownID;
} // interface ChatServerOperations
