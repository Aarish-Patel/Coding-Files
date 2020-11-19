class Public_Key
{
    int r;
    String public_key;
    Public_Key()
    {
        r = 0;
        public_key = "";
    }
    int Storage_Creation()
    {
        r = (int)(Math.random() * 10);
        public_key += String.valueOf(r);
        return r;
    }
}