package com.tencent.smtt.utils;

import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class n
{
  public static String a(String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte, a parama, boolean paramBoolean)
  {
    Object localObject = null;
    if (paramArrayOfByte == null) {
      return null;
    }
    paramMap = a(paramString, paramMap);
    paramString = (String)localObject;
    if (paramMap != null)
    {
      if (paramBoolean) {
        a(paramMap, paramArrayOfByte);
      } else {
        b(paramMap, paramArrayOfByte);
      }
      paramString = a(paramMap, parama, false);
    }
    return paramString;
  }
  
  public static String a(String paramString, byte[] paramArrayOfByte, a parama, boolean paramBoolean)
  {
    Object localObject2 = null;
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        localObject1 = p.a().c();
        continue;
        localObject1 = o.a().b();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString);
        localStringBuilder.append((String)localObject1);
        localObject1 = localStringBuilder.toString();
        if (!paramBoolean) {}
      }
      catch (Exception paramString)
      {
        Object localObject1;
        continue;
        paramArrayOfByte = paramString;
        continue;
      }
      try
      {
        paramString = p.a().a(paramArrayOfByte);
      }
      catch (Exception paramString) {}
    }
    paramString = o.a().a(paramArrayOfByte);
    break label168;
    paramString.printStackTrace();
    if (paramArrayOfByte == null) {
      return null;
    }
    paramString = new HashMap();
    paramString.put("Content-Type", "application/x-www-form-urlencoded");
    paramString.put("Content-Length", String.valueOf(paramArrayOfByte.length));
    localObject1 = a((String)localObject1, paramString);
    paramString = (String)localObject2;
    if (localObject1 != null)
    {
      b((HttpURLConnection)localObject1, paramArrayOfByte);
      paramString = a((HttpURLConnection)localObject1, parama, paramBoolean);
    }
    return paramString;
    paramString.printStackTrace();
    return null;
  }
  
  /* Error */
  private static String a(HttpURLConnection paramHttpURLConnection, a parama, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: invokevirtual 91	java/net/HttpURLConnection:getResponseCode	()I
    //   10: istore_3
    //   11: aload_1
    //   12: ifnull +10 -> 22
    //   15: aload_1
    //   16: iload_3
    //   17: invokeinterface 94 2 0
    //   22: iload_3
    //   23: sipush 200
    //   26: if_icmpne +184 -> 210
    //   29: aload_0
    //   30: invokevirtual 98	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   33: astore_1
    //   34: aload_0
    //   35: invokevirtual 101	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   38: astore_0
    //   39: aload_0
    //   40: ifnull +24 -> 64
    //   43: aload_0
    //   44: ldc 103
    //   46: invokevirtual 107	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   49: ifeq +15 -> 64
    //   52: new 109	java/util/zip/GZIPInputStream
    //   55: dup
    //   56: aload_1
    //   57: invokespecial 112	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   60: astore_0
    //   61: goto +38 -> 99
    //   64: aload_0
    //   65: ifnull +32 -> 97
    //   68: aload_0
    //   69: ldc 114
    //   71: invokevirtual 107	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   74: ifeq +23 -> 97
    //   77: new 116	java/util/zip/InflaterInputStream
    //   80: dup
    //   81: aload_1
    //   82: new 118	java/util/zip/Inflater
    //   85: dup
    //   86: iconst_1
    //   87: invokespecial 121	java/util/zip/Inflater:<init>	(Z)V
    //   90: invokespecial 124	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    //   93: astore_0
    //   94: goto +5 -> 99
    //   97: aload_1
    //   98: astore_0
    //   99: new 126	java/io/ByteArrayOutputStream
    //   102: dup
    //   103: invokespecial 127	java/io/ByteArrayOutputStream:<init>	()V
    //   106: astore 4
    //   108: sipush 128
    //   111: newarray <illegal type>
    //   113: astore_1
    //   114: aload_0
    //   115: aload_1
    //   116: invokevirtual 133	java/io/InputStream:read	([B)I
    //   119: istore_3
    //   120: iload_3
    //   121: iconst_m1
    //   122: if_icmpeq +14 -> 136
    //   125: aload 4
    //   127: aload_1
    //   128: iconst_0
    //   129: iload_3
    //   130: invokevirtual 137	java/io/ByteArrayOutputStream:write	([BII)V
    //   133: goto -19 -> 114
    //   136: iload_2
    //   137: ifeq +21 -> 158
    //   140: new 79	java/lang/String
    //   143: dup
    //   144: aload 4
    //   146: invokevirtual 141	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   149: ldc -113
    //   151: invokespecial 146	java/lang/String:<init>	([BLjava/lang/String;)V
    //   154: astore_1
    //   155: goto +128 -> 283
    //   158: new 79	java/lang/String
    //   161: dup
    //   162: invokestatic 40	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   165: aload 4
    //   167: invokevirtual 141	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   170: invokevirtual 148	com/tencent/smtt/utils/o:c	([B)[B
    //   173: invokespecial 151	java/lang/String:<init>	([B)V
    //   176: astore_1
    //   177: goto +106 -> 283
    //   180: astore_1
    //   181: goto +91 -> 272
    //   184: astore 5
    //   186: aload 4
    //   188: astore_1
    //   189: aload 5
    //   191: astore 4
    //   193: goto +56 -> 249
    //   196: astore_1
    //   197: aconst_null
    //   198: astore 4
    //   200: goto +72 -> 272
    //   203: astore 4
    //   205: aconst_null
    //   206: astore_1
    //   207: goto +42 -> 249
    //   210: aconst_null
    //   211: astore_0
    //   212: aload_0
    //   213: astore 4
    //   215: aload 5
    //   217: astore_1
    //   218: aload_0
    //   219: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   222: aload 4
    //   224: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   227: aload_1
    //   228: areturn
    //   229: astore_1
    //   230: aconst_null
    //   231: astore 5
    //   233: aload 4
    //   235: astore_0
    //   236: aload 5
    //   238: astore 4
    //   240: goto +32 -> 272
    //   243: astore 4
    //   245: aconst_null
    //   246: astore_0
    //   247: aload_0
    //   248: astore_1
    //   249: aload 4
    //   251: invokevirtual 155	java/lang/Throwable:printStackTrace	()V
    //   254: aload_0
    //   255: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   258: aload_1
    //   259: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   262: aconst_null
    //   263: areturn
    //   264: astore 5
    //   266: aload_1
    //   267: astore 4
    //   269: aload 5
    //   271: astore_1
    //   272: aload_0
    //   273: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   276: aload 4
    //   278: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   281: aload_1
    //   282: athrow
    //   283: goto -65 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	paramHttpURLConnection	HttpURLConnection
    //   0	286	1	parama	a
    //   0	286	2	paramBoolean	boolean
    //   10	120	3	i	int
    //   1	198	4	localObject1	Object
    //   203	1	4	localThrowable1	Throwable
    //   213	26	4	localObject2	Object
    //   243	7	4	localThrowable2	Throwable
    //   267	10	4	locala	a
    //   4	1	5	localObject3	Object
    //   184	32	5	localThrowable3	Throwable
    //   231	6	5	localObject4	Object
    //   264	6	5	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   108	114	180	finally
    //   114	120	180	finally
    //   125	133	180	finally
    //   140	155	180	finally
    //   158	177	180	finally
    //   108	114	184	java/lang/Throwable
    //   114	120	184	java/lang/Throwable
    //   125	133	184	java/lang/Throwable
    //   140	155	184	java/lang/Throwable
    //   158	177	184	java/lang/Throwable
    //   99	108	196	finally
    //   99	108	203	java/lang/Throwable
    //   6	11	229	finally
    //   15	22	229	finally
    //   29	39	229	finally
    //   43	61	229	finally
    //   68	94	229	finally
    //   6	11	243	java/lang/Throwable
    //   15	22	243	java/lang/Throwable
    //   29	39	243	java/lang/Throwable
    //   43	61	243	java/lang/Throwable
    //   68	94	243	java/lang/Throwable
    //   249	254	264	finally
  }
  
  private static HttpURLConnection a(String paramString, Map<String, String> paramMap)
  {
    String str = null;
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      try
      {
        localHttpURLConnection.setRequestMethod("POST");
        localHttpURLConnection.setDoOutput(true);
        localHttpURLConnection.setDoInput(true);
        localHttpURLConnection.setUseCaches(false);
        localHttpURLConnection.setConnectTimeout(20000);
        if (Build.VERSION.SDK_INT > 13) {
          paramString = "Connection";
        }
        for (str = "close";; str = "false")
        {
          localHttpURLConnection.setRequestProperty(paramString, str);
          break;
          paramString = "http.keepAlive";
        }
        paramString = paramMap.entrySet().iterator();
        while (paramString.hasNext())
        {
          paramMap = (Map.Entry)paramString.next();
          localHttpURLConnection.setRequestProperty((String)paramMap.getKey(), (String)paramMap.getValue());
        }
        return localHttpURLConnection;
      }
      catch (Exception paramMap)
      {
        paramString = localHttpURLConnection;
      }
      paramMap.printStackTrace();
    }
    catch (Exception paramMap)
    {
      paramString = str;
    }
    return paramString;
  }
  
  private static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Exception paramCloseable) {}
  }
  
  /* Error */
  private static void a(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 234	java/util/zip/GZIPOutputStream
    //   3: dup
    //   4: new 236	java/io/BufferedOutputStream
    //   7: dup
    //   8: aload_0
    //   9: invokevirtual 240	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   12: ldc -15
    //   14: invokespecial 244	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   17: invokespecial 247	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   20: astore_0
    //   21: aload_0
    //   22: astore_2
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 251	java/io/OutputStream:write	([B)V
    //   28: aload_0
    //   29: astore_2
    //   30: aload_0
    //   31: invokevirtual 254	java/io/OutputStream:flush	()V
    //   34: goto +22 -> 56
    //   37: astore_1
    //   38: goto +12 -> 50
    //   41: astore_0
    //   42: aconst_null
    //   43: astore_2
    //   44: goto +22 -> 66
    //   47: astore_1
    //   48: aconst_null
    //   49: astore_0
    //   50: aload_0
    //   51: astore_2
    //   52: aload_1
    //   53: invokevirtual 62	java/lang/Exception:printStackTrace	()V
    //   56: aconst_null
    //   57: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   60: aload_0
    //   61: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   64: return
    //   65: astore_0
    //   66: aconst_null
    //   67: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   70: aload_2
    //   71: invokestatic 154	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   74: aload_0
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	paramHttpURLConnection	HttpURLConnection
    //   0	76	1	paramArrayOfByte	byte[]
    //   22	49	2	localHttpURLConnection	HttpURLConnection
    // Exception table:
    //   from	to	target	type
    //   23	28	37	java/lang/Exception
    //   30	34	37	java/lang/Exception
    //   0	21	41	finally
    //   0	21	47	java/lang/Exception
    //   23	28	65	finally
    //   30	34	65	finally
    //   52	56	65	finally
  }
  
  private static void b(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getOutputStream();
      paramHttpURLConnection.write(paramArrayOfByte);
      paramHttpURLConnection.flush();
      return;
    }
    catch (Exception paramHttpURLConnection)
    {
      paramHttpURLConnection.printStackTrace();
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              C:\Users\lixia\Desktop\android反编译三件套\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\smtt\utils\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */