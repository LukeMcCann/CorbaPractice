package chat;

/**
* chat/UnknownIDHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from chat.idl
* Wednesday, 13 February 2019 at 18:22:16 Greenwich Mean Time
*/

public final class UnknownIDHolder implements org.omg.CORBA.portable.Streamable
{
  public chat.UnknownID value = null;

  public UnknownIDHolder ()
  {
  }

  public UnknownIDHolder (chat.UnknownID initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = chat.UnknownIDHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    chat.UnknownIDHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return chat.UnknownIDHelper.type ();
  }

}
