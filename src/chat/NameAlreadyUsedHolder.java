package chat;

/**
* chat/NameAlreadyUsedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from chat.idl
* Wednesday, 13 February 2019 at 18:22:16 Greenwich Mean Time
*/

public final class NameAlreadyUsedHolder implements org.omg.CORBA.portable.Streamable
{
  public chat.NameAlreadyUsed value = null;

  public NameAlreadyUsedHolder ()
  {
  }

  public NameAlreadyUsedHolder (chat.NameAlreadyUsed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = chat.NameAlreadyUsedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    chat.NameAlreadyUsedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return chat.NameAlreadyUsedHelper.type ();
  }

}