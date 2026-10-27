package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParserConfig {
    public static final java.lang.String AUTOTYPE_ACCEPT = "fastjson.parser.autoTypeAccept";
    public static final java.lang.String AUTOTYPE_SUPPORT_PROPERTY = "fastjson.parser.autoTypeSupport";
    public static final boolean AUTO_SUPPORT = false;
    private static final java.lang.String[] AUTO_TYPE_ACCEPT_LIST = null;
    public static final java.lang.String[] DENYS = null;
    public static final java.lang.String DENY_PROPERTY = "fastjson.parser.deny";
    private static boolean awtError;
    public static com.alibaba.fastjson.parser.ParserConfig global;
    private static boolean jdk8Error;
    private java.lang.String[] acceptList;
    private boolean asmEnable;
    protected com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory asmFactory;
    private boolean autoTypeSupport;
    public boolean compatibleWithJavaBean;
    protected java.lang.ClassLoader defaultClassLoader;
    private java.lang.String[] denyList;
    private final com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> deserializers;
    public final boolean fieldBased;
    private int maxTypeNameLength;
    public com.alibaba.fastjson.PropertyNamingStrategy propertyNamingStrategy;
    public final com.alibaba.fastjson.parser.SymbolTable symbolTable;

    static {
            java.lang.String r0 = "fastjson.parser.deny"
            java.lang.String r0 = com.alibaba.fastjson.util.IOUtils.getStringProperty(r0)
            java.lang.String[] r0 = splitItemsFormProperty(r0)
            com.alibaba.fastjson.parser.ParserConfig.DENYS = r0
            java.lang.String r0 = "fastjson.parser.autoTypeSupport"
            java.lang.String r0 = com.alibaba.fastjson.util.IOUtils.getStringProperty(r0)
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)
            com.alibaba.fastjson.parser.ParserConfig.AUTO_SUPPORT = r0
            java.lang.String r0 = "fastjson.parser.autoTypeAccept"
            java.lang.String r0 = com.alibaba.fastjson.util.IOUtils.getStringProperty(r0)
            java.lang.String[] r0 = splitItemsFormProperty(r0)
            r1 = 0
            if (r0 != 0) goto L29
            java.lang.String[] r0 = new java.lang.String[r1]
        L29:
            com.alibaba.fastjson.parser.ParserConfig.AUTO_TYPE_ACCEPT_LIST = r0
            com.alibaba.fastjson.parser.ParserConfig r0 = new com.alibaba.fastjson.parser.ParserConfig
            r0.<init>()
            com.alibaba.fastjson.parser.ParserConfig.global = r0
            com.alibaba.fastjson.parser.ParserConfig.awtError = r1
            com.alibaba.fastjson.parser.ParserConfig.jdk8Error = r1
            return
    }

    public ParserConfig() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ParserConfig(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    private ParserConfig(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory r5, java.lang.ClassLoader r6, boolean r7) {
            r4 = this;
            r4.<init>()
            com.alibaba.fastjson.util.IdentityHashMap r0 = new com.alibaba.fastjson.util.IdentityHashMap
            r0.<init>()
            r4.deserializers = r0
            boolean r0 = com.alibaba.fastjson.util.ASMUtils.IS_ANDROID
            r1 = r0 ^ 1
            r4.asmEnable = r1
            com.alibaba.fastjson.parser.SymbolTable r1 = new com.alibaba.fastjson.parser.SymbolTable
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2)
            r4.symbolTable = r1
            boolean r1 = com.alibaba.fastjson.parser.ParserConfig.AUTO_SUPPORT
            r4.autoTypeSupport = r1
            java.lang.String r1 = "bsh,com.mchange,com.sun.,java.lang.Thread,java.net.Socket,java.rmi,javax.xml,org.apache.bcel,org.apache.commons.beanutils,org.apache.commons.collections.Transformer,org.apache.commons.collections.functors,org.apache.commons.collections4.comparators,org.apache.commons.fileupload,org.apache.myfaces.context.servlet,org.apache.tomcat,org.apache.wicket.util,org.codehaus.groovy.runtime,org.hibernate,org.jboss,org.mozilla.javascript,org.python.core,org.springframework"
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            r4.denyList = r1
            java.lang.String[] r1 = com.alibaba.fastjson.parser.ParserConfig.AUTO_TYPE_ACCEPT_LIST
            r4.acceptList = r1
            r1 = 256(0x100, float:3.59E-43)
            r4.maxTypeNameLength = r1
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean
            r4.compatibleWithJavaBean = r1
            r4.fieldBased = r7
            if (r5 != 0) goto L4f
            if (r0 != 0) goto L4f
            if (r6 != 0) goto L49
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory r6 = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory     // Catch: java.lang.Throwable -> L47
            com.alibaba.fastjson.util.ASMClassLoader r7 = new com.alibaba.fastjson.util.ASMClassLoader     // Catch: java.lang.Throwable -> L47
            r7.<init>()     // Catch: java.lang.Throwable -> L47
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L47
            r5 = r6
            goto L4f
        L47:
            goto L4f
        L49:
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory r7 = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory     // Catch: java.lang.Throwable -> L47
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L47
            r5 = r7
        L4f:
            r4.asmFactory = r5
            if (r5 != 0) goto L56
            r5 = 0
            r4.asmEnable = r5
        L56:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.MiscCodec r6 = com.alibaba.fastjson.serializer.MiscCodec.instance
            java.lang.Class<java.text.SimpleDateFormat> r7 = java.text.SimpleDateFormat.class
            r5.put(r7, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.sql.Timestamp> r7 = java.sql.Timestamp.class
            com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer r0 = com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer.instance_timestamp
            r5.put(r7, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.sql.Date> r7 = java.sql.Date.class
            com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer r0 = com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer.instance
            r5.put(r7, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.sql.Time> r7 = java.sql.Time.class
            com.alibaba.fastjson.parser.deserializer.TimeDeserializer r0 = com.alibaba.fastjson.parser.deserializer.TimeDeserializer.instance
            r5.put(r7, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            com.alibaba.fastjson.serializer.DateCodec r0 = com.alibaba.fastjson.serializer.DateCodec.instance
            r5.put(r7, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.CalendarCodec r7 = com.alibaba.fastjson.serializer.CalendarCodec.instance
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<javax.xml.datatype.XMLGregorianCalendar> r0 = javax.xml.datatype.XMLGregorianCalendar.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<com.alibaba.fastjson.JSONObject> r7 = com.alibaba.fastjson.JSONObject.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r0 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r7, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.CollectionCodec r7 = com.alibaba.fastjson.serializer.CollectionCodec.instance
            java.lang.Class<com.alibaba.fastjson.JSONArray> r0 = com.alibaba.fastjson.JSONArray.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r1 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r1 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r1 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r1 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r1 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r0 = java.util.concurrent.ConcurrentHashMap.class
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r1 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer r7 = com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer.instance
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r5.put(r0, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.alibaba.fastjson.serializer.StringCodec r1 = com.alibaba.fastjson.serializer.StringCodec.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.StringBuffer> r0 = java.lang.StringBuffer.class
            com.alibaba.fastjson.serializer.StringCodec r1 = com.alibaba.fastjson.serializer.StringCodec.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.StringBuilder> r0 = java.lang.StringBuilder.class
            com.alibaba.fastjson.serializer.StringCodec r1 = com.alibaba.fastjson.serializer.StringCodec.instance
            r5.put(r0, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.CharacterCodec r0 = com.alibaba.fastjson.serializer.CharacterCodec.instance
            java.lang.Class r1 = java.lang.Character.TYPE
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.parser.deserializer.NumberDeserializer r0 = com.alibaba.fastjson.parser.deserializer.NumberDeserializer.instance
            java.lang.Class r1 = java.lang.Byte.TYPE
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class r1 = java.lang.Short.TYPE
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class r1 = java.lang.Integer.TYPE
            com.alibaba.fastjson.serializer.IntegerCodec r2 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            com.alibaba.fastjson.serializer.IntegerCodec r2 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class r1 = java.lang.Long.TYPE
            com.alibaba.fastjson.serializer.LongCodec r2 = com.alibaba.fastjson.serializer.LongCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            com.alibaba.fastjson.serializer.LongCodec r2 = com.alibaba.fastjson.serializer.LongCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            com.alibaba.fastjson.serializer.BigIntegerCodec r2 = com.alibaba.fastjson.serializer.BigIntegerCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            com.alibaba.fastjson.serializer.BigDecimalCodec r2 = com.alibaba.fastjson.serializer.BigDecimalCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class r1 = java.lang.Float.TYPE
            com.alibaba.fastjson.serializer.FloatCodec r2 = com.alibaba.fastjson.serializer.FloatCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            com.alibaba.fastjson.serializer.FloatCodec r2 = com.alibaba.fastjson.serializer.FloatCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class r1 = java.lang.Double.TYPE
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            r5.put(r1, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.BooleanCodec r1 = com.alibaba.fastjson.serializer.BooleanCodec.instance
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r5.put(r2, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r5.put(r2, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r5.put(r2, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.CharArrayCodec r2 = new com.alibaba.fastjson.serializer.CharArrayCodec
            r2.<init>()
            java.lang.Class<char[]> r3 = char[].class
            r5.put(r3, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r2 = java.util.concurrent.atomic.AtomicBoolean.class
            r5.put(r2, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            com.alibaba.fastjson.serializer.IntegerCodec r2 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            com.alibaba.fastjson.serializer.LongCodec r2 = com.alibaba.fastjson.serializer.LongCodec.instance
            r5.put(r1, r2)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.ReferenceCodec r1 = com.alibaba.fastjson.serializer.ReferenceCodec.instance
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r2 = java.util.concurrent.atomic.AtomicReference.class
            r5.put(r2, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.ref.WeakReference> r2 = java.lang.ref.WeakReference.class
            r5.put(r2, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.ref.SoftReference> r2 = java.lang.ref.SoftReference.class
            r5.put(r2, r1)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.TimeZone> r1 = java.util.TimeZone.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.Locale> r1 = java.util.Locale.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.Currency> r1 = java.util.Currency.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.net.InetAddress> r1 = java.net.InetAddress.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.net.Inet4Address> r1 = java.net.Inet4Address.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.net.Inet6Address> r1 = java.net.Inet6Address.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.net.InetSocketAddress> r1 = java.net.InetSocketAddress.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.net.URL> r1 = java.net.URL.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.regex.Pattern> r1 = java.util.regex.Pattern.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.nio.charset.Charset> r1 = java.nio.charset.Charset.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<com.alibaba.fastjson.JSONPath> r1 = com.alibaba.fastjson.JSONPath.class
            r5.put(r1, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Number> r6 = java.lang.Number.class
            r5.put(r6, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.serializer.AtomicCodec r6 = com.alibaba.fastjson.serializer.AtomicCodec.instance
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r0 = java.util.concurrent.atomic.AtomicIntegerArray.class
            r5.put(r0, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r0 = java.util.concurrent.atomic.AtomicLongArray.class
            r5.put(r0, r6)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.StackTraceElement> r6 = java.lang.StackTraceElement.class
            com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer r0 = com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer.instance
            r5.put(r6, r0)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.io.Serializable> r6 = java.io.Serializable.class
            r5.put(r6, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Cloneable> r6 = java.lang.Cloneable.class
            r5.put(r6, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.lang.Comparable> r6 = java.lang.Comparable.class
            r5.put(r6, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            java.lang.Class<java.io.Closeable> r6 = java.io.Closeable.class
            r5.put(r6, r7)
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r4.deserializers
            com.alibaba.fastjson.parser.deserializer.JSONPDeserializer r6 = new com.alibaba.fastjson.parser.deserializer.JSONPDeserializer
            r6.<init>()
            java.lang.Class<com.alibaba.fastjson.JSONPObject> r7 = com.alibaba.fastjson.JSONPObject.class
            r5.put(r7, r6)
            java.lang.String[] r5 = com.alibaba.fastjson.parser.ParserConfig.DENYS
            r4.addItemsToDeny(r5)
            java.lang.String[] r5 = com.alibaba.fastjson.parser.ParserConfig.AUTO_TYPE_ACCEPT_LIST
            r4.addItemsToAccept(r5)
            return
    }

    public ParserConfig(java.lang.ClassLoader r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r3, r1)
            return
    }

    public ParserConfig(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r2)
            return
    }

    private void addItemsToAccept(java.lang.String[] r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto Lf
        L3:
            r0 = 0
        L4:
            int r1 = r3.length
            if (r0 >= r1) goto Lf
            r1 = r3[r0]
            r2.addAccept(r1)
            int r0 = r0 + 1
            goto L4
        Lf:
            return
    }

    private void addItemsToDeny(java.lang.String[] r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto Lf
        L3:
            r0 = 0
        L4:
            int r1 = r3.length
            if (r0 >= r1) goto Lf
            r1 = r3[r0]
            r2.addDeny(r1)
            int r0 = r0 + 1
            goto L4
        Lf:
            return
    }

    public static java.lang.reflect.Field getFieldFromCache(java.lang.String r4, java.util.Map<java.lang.String, java.lang.reflect.Field> r5) {
            java.lang.Object r0 = r5.get(r4)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r5.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L1f:
            if (r0 != 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "m_"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r5.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L38:
            if (r0 != 0) goto L5e
            r1 = 0
            char r2 = r4.charAt(r1)
            r3 = 97
            if (r2 < r3) goto L5e
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 > r3) goto L5e
            char[] r4 = r4.toCharArray()
            char r0 = r4[r1]
            int r0 = r0 + (-32)
            char r0 = (char) r0
            r4[r1] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.Object r4 = r5.get(r0)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            return r4
        L5e:
            return r0
    }

    public static com.alibaba.fastjson.parser.ParserConfig getGlobalInstance() {
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.global
            return r0
    }

    public static boolean isPrimitive2(java.lang.Class<?> r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L4b
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.sql.Time> r0 = java.sql.Time.class
            if (r1 == r0) goto L4b
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            if (r1 == r0) goto L4b
            boolean r1 = r1.isEnum()
            if (r1 == 0) goto L49
            goto L4b
        L49:
            r1 = 0
            return r1
        L4b:
            r1 = 1
            return r1
    }

    public static void parserAllFieldToCache(java.lang.Class<?> r6, java.util.Map<java.lang.String, java.lang.reflect.Field> r7) {
            java.lang.reflect.Field[] r0 = r6.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r5 = r7.containsKey(r4)
            if (r5 != 0) goto L17
            r7.put(r4, r3)
        L17:
            int r2 = r2 + 1
            goto L6
        L1a:
            java.lang.Class r0 = r6.getSuperclass()
            if (r0 == 0) goto L2f
            java.lang.Class r0 = r6.getSuperclass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L2f
            java.lang.Class r6 = r6.getSuperclass()
            parserAllFieldToCache(r6, r7)
        L2f:
            return
    }

    private static java.lang.String[] splitItemsFormProperty(java.lang.String r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length()
            if (r0 <= 0) goto Lf
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public void addAccept(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L2b
            int r0 = r6.length()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.lang.String[] r0 = r5.acceptList
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L1c
            r4 = r0[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L19
            goto L2b
        L19:
            int r3 = r3 + 1
            goto Le
        L1c:
            java.lang.String[] r0 = r5.acceptList
            int r1 = r0.length
            int r3 = r1 + 1
            java.lang.String[] r3 = new java.lang.String[r3]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            r3[r1] = r6
            r5.acceptList = r3
        L2b:
            return
    }

    public void addDeny(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L2b
            int r0 = r6.length()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.lang.String[] r0 = r5.denyList
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L1c
            r4 = r0[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L19
            goto L2b
        L19:
            int r3 = r3 + 1
            goto Le
        L1c:
            java.lang.String[] r0 = r5.denyList
            int r1 = r0.length
            int r3 = r1 + 1
            java.lang.String[] r3 = new java.lang.String[r3]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            r3[r1] = r6
            r5.denyList = r3
        L2b:
            return
    }

    public java.lang.Class<?> checkAutoType(java.lang.String r10, java.lang.Class<?> r11) {
            r9 = this;
            if (r10 != 0) goto L4
            r10 = 0
            return r10
        L4:
            int r0 = r10.length()
            int r1 = r9.maxTypeNameLength
            java.lang.String r2 = "autoType is not support. "
            if (r0 >= r1) goto L17b
            r0 = 36
            r1 = 46
            java.lang.String r0 = r10.replace(r0, r1)
            boolean r1 = r9.autoTypeSupport
            r3 = 0
            if (r1 != 0) goto L1d
            if (r11 == 0) goto L62
        L1d:
            r1 = 0
        L1e:
            java.lang.String[] r4 = r9.acceptList
            int r5 = r4.length
            if (r1 >= r5) goto L35
            r4 = r4[r1]
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L32
            java.lang.ClassLoader r11 = r9.defaultClassLoader
            java.lang.Class r10 = com.alibaba.fastjson.util.TypeUtils.loadClass(r10, r11)
            return r10
        L32:
            int r1 = r1 + 1
            goto L1e
        L35:
            r1 = 0
        L36:
            java.lang.String[] r4 = r9.denyList
            int r5 = r4.length
            if (r1 >= r5) goto L62
            r4 = r4[r1]
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L5f
            java.lang.Class r4 = com.alibaba.fastjson.util.TypeUtils.getClassFromMapping(r10)
            if (r4 == 0) goto L4a
            goto L5f
        L4a:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L5f:
            int r1 = r1 + 1
            goto L36
        L62:
            java.lang.Class r1 = com.alibaba.fastjson.util.TypeUtils.getClassFromMapping(r10)
            if (r1 != 0) goto L6e
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r9.deserializers
            java.lang.Class r1 = r1.findClass(r10)
        L6e:
            java.lang.String r4 = " -> "
            java.lang.String r5 = "type not match. "
            if (r1 == 0) goto L9d
            if (r11 == 0) goto L9c
            boolean r0 = r11.isAssignableFrom(r1)
            if (r0 == 0) goto L7d
            goto L9c
        L7d:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r11.getName()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L9c:
            return r1
        L9d:
            boolean r6 = r9.autoTypeSupport
            if (r6 != 0) goto L106
            r6 = 0
        La2:
            java.lang.String[] r7 = r9.denyList
            int r8 = r7.length
            if (r6 >= r8) goto Lc7
            r7 = r7[r6]
            boolean r7 = r0.startsWith(r7)
            if (r7 != 0) goto Lb2
            int r6 = r6 + 1
            goto La2
        Lb2:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        Lc7:
            java.lang.String[] r6 = r9.acceptList
            int r7 = r6.length
            if (r3 >= r7) goto L106
            r6 = r6[r3]
            boolean r6 = r0.startsWith(r6)
            if (r6 == 0) goto L103
            java.lang.ClassLoader r0 = r9.defaultClassLoader
            java.lang.Class r0 = com.alibaba.fastjson.util.TypeUtils.loadClass(r10, r0)
            if (r11 == 0) goto L102
            boolean r1 = r11.isAssignableFrom(r0)
            if (r1 != 0) goto Le3
            goto L102
        Le3:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r11.getName()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L102:
            return r0
        L103:
            int r3 = r3 + 1
            goto Lc7
        L106:
            boolean r0 = r9.autoTypeSupport
            if (r0 != 0) goto L10c
            if (r11 == 0) goto L112
        L10c:
            java.lang.ClassLoader r0 = r9.defaultClassLoader
            java.lang.Class r1 = com.alibaba.fastjson.util.TypeUtils.loadClass(r10, r0)
        L112:
            if (r1 == 0) goto L161
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L14c
            java.lang.Class<javax.sql.DataSource> r0 = javax.sql.DataSource.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L14c
            if (r11 == 0) goto L161
            boolean r0 = r11.isAssignableFrom(r1)
            if (r0 == 0) goto L12d
            return r1
        L12d:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r11.getName()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L14c:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L161:
            boolean r11 = r9.autoTypeSupport
            if (r11 == 0) goto L166
            return r1
        L166:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L17b:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
    }

    public void configFromPropety(java.util.Properties r2) {
            r1 = this;
            java.lang.String r0 = "fastjson.parser.deny"
            java.lang.String r0 = r2.getProperty(r0)
            java.lang.String[] r0 = splitItemsFormProperty(r0)
            r1.addItemsToDeny(r0)
            java.lang.String r0 = "fastjson.parser.autoTypeAccept"
            java.lang.String r0 = r2.getProperty(r0)
            java.lang.String[] r0 = splitItemsFormProperty(r0)
            r1.addItemsToAccept(r0)
            java.lang.String r0 = "fastjson.parser.autoTypeSupport"
            java.lang.String r2 = r2.getProperty(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            r2 = 1
            r1.autoTypeSupport = r2
            return
        L2c:
            java.lang.String r0 = "false"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L37
            r2 = 0
            r1.autoTypeSupport = r2
        L37:
            return
    }

    public com.alibaba.fastjson.parser.deserializer.FieldDeserializer createFieldDeserializer(com.alibaba.fastjson.parser.ParserConfig r5, com.alibaba.fastjson.util.JavaBeanInfo r6, com.alibaba.fastjson.util.FieldInfo r7) {
            r4 = this;
            java.lang.Class<?> r6 = r6.clazz
            java.lang.Class<?> r0 = r7.fieldClass
            com.alibaba.fastjson.annotation.JSONField r1 = r7.getAnnotation()
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.Class r1 = r1.deserializeUsing()
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r1 != r3) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 != 0) goto L25
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 == r1) goto L1f
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            if (r0 != r1) goto L25
        L1f:
            com.alibaba.fastjson.parser.deserializer.ArrayListTypeFieldDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.ArrayListTypeFieldDeserializer
            r0.<init>(r5, r6, r7)
            return r0
        L25:
            com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer
            r0.<init>(r5, r6, r7)
            return r0
    }

    public com.alibaba.fastjson.parser.deserializer.ObjectDeserializer createJavaBeanDeserializer(java.lang.Class<?> r10, java.lang.reflect.Type r11) {
            r9 = this;
            boolean r0 = r9.asmEnable
            boolean r1 = r9.fieldBased
            r1 = r1 ^ 1
            r0 = r0 & r1
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            r2 = 0
            if (r0 == 0) goto L4a
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r3 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r3 = r10.getAnnotation(r3)
            com.alibaba.fastjson.annotation.JSONType r3 = (com.alibaba.fastjson.annotation.JSONType) r3
            if (r3 == 0) goto L2b
            java.lang.Class r0 = r3.deserializer()
            if (r0 == r1) goto L27
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L27
            boolean r4 = r0 instanceof com.alibaba.fastjson.parser.deserializer.ObjectDeserializer     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L27
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r0     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            boolean r0 = r3.asm()
        L2b:
            if (r0 == 0) goto L4a
            java.lang.Class r3 = com.alibaba.fastjson.util.JavaBeanInfo.getBuilderClass(r3)
            if (r3 != 0) goto L34
            r3 = r10
        L34:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 != 0) goto L40
            r0 = 0
            goto L4a
        L40:
            java.lang.Class r3 = r3.getSuperclass()
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r3 == r4) goto L4a
            if (r3 != 0) goto L34
        L4a:
            java.lang.reflect.TypeVariable[] r3 = r10.getTypeParameters()
            int r3 = r3.length
            if (r3 == 0) goto L52
            r0 = 0
        L52:
            if (r0 == 0) goto L61
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory r3 = r9.asmFactory
            if (r3 == 0) goto L61
            com.alibaba.fastjson.util.ASMClassLoader r3 = r3.classLoader
            boolean r3 = r3.isExternalClass(r10)
            if (r3 == 0) goto L61
            r0 = 0
        L61:
            if (r0 == 0) goto L6b
            java.lang.String r0 = r10.getSimpleName()
            boolean r0 = com.alibaba.fastjson.util.ASMUtils.checkName(r0)
        L6b:
            if (r0 == 0) goto L10c
            boolean r3 = r10.isInterface()
            if (r3 == 0) goto L74
            r0 = 0
        L74:
            com.alibaba.fastjson.PropertyNamingStrategy r3 = r9.propertyNamingStrategy
            com.alibaba.fastjson.util.JavaBeanInfo r3 = com.alibaba.fastjson.util.JavaBeanInfo.build(r10, r11, r3)
            if (r0 == 0) goto L84
            com.alibaba.fastjson.util.FieldInfo[] r4 = r3.fields
            int r4 = r4.length
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 <= r5) goto L84
            r0 = 0
        L84:
            java.lang.reflect.Constructor<?> r4 = r3.defaultConstructor
            if (r0 == 0) goto L91
            if (r4 != 0) goto L91
            boolean r4 = r10.isInterface()
            if (r4 != 0) goto L91
            r0 = 0
        L91:
            com.alibaba.fastjson.util.FieldInfo[] r3 = r3.fields
            int r4 = r3.length
            r5 = 0
        L95:
            if (r5 >= r4) goto L10c
            r6 = r3[r5]
            boolean r7 = r6.getOnly
            if (r7 == 0) goto La0
        L9d:
            r0 = 0
            goto L10c
        La0:
            java.lang.Class<?> r7 = r6.fieldClass
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 != 0) goto Lad
            goto L9d
        Lad:
            boolean r8 = r7.isMemberClass()
            if (r8 == 0) goto Lbe
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto Lbe
            goto L9d
        Lbe:
            java.lang.reflect.Member r8 = r6.getMember()
            if (r8 == 0) goto Ld3
            java.lang.reflect.Member r8 = r6.getMember()
            java.lang.String r8 = r8.getName()
            boolean r8 = com.alibaba.fastjson.util.ASMUtils.checkName(r8)
            if (r8 != 0) goto Ld3
            goto L9d
        Ld3:
            com.alibaba.fastjson.annotation.JSONField r6 = r6.getAnnotation()
            if (r6 == 0) goto Lfa
            java.lang.String r8 = r6.name()
            boolean r8 = com.alibaba.fastjson.util.ASMUtils.checkName(r8)
            if (r8 == 0) goto L9d
            java.lang.String r8 = r6.format()
            int r8 = r8.length()
            if (r8 != 0) goto L9d
            java.lang.Class r8 = r6.deserializeUsing()
            if (r8 != r1) goto L9d
            boolean r6 = r6.unwrapped()
            if (r6 == 0) goto Lfa
            goto L9d
        Lfa:
            boolean r6 = r7.isEnum()
            if (r6 == 0) goto L109
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r6 = r9.getDeserializer(r7)
            boolean r6 = r6 instanceof com.alibaba.fastjson.parser.deserializer.EnumDeserializer
            if (r6 != 0) goto L109
            goto L9d
        L109:
            int r5 = r5 + 1
            goto L95
        L10c:
            if (r0 == 0) goto L11f
            boolean r1 = r10.isMemberClass()
            if (r1 == 0) goto L11f
            int r1 = r10.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L11f
            goto L120
        L11f:
            r2 = r0
        L120:
            if (r2 != 0) goto L128
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            r0.<init>(r9, r10, r11)
            return r0
        L128:
            com.alibaba.fastjson.PropertyNamingStrategy r0 = r9.propertyNamingStrategy
            com.alibaba.fastjson.util.JavaBeanInfo r0 = com.alibaba.fastjson.util.JavaBeanInfo.build(r10, r11, r0)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory r1 = r9.asmFactory     // Catch: java.lang.Exception -> L135 com.alibaba.fastjson.JSONException -> L151 java.lang.NoSuchMethodException -> L157
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r10 = r1.createJavaBeanDeserializer(r9, r0)     // Catch: java.lang.Exception -> L135 com.alibaba.fastjson.JSONException -> L151 java.lang.NoSuchMethodException -> L157
            return r10
        L135:
            r11 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "create asm deserializer error, "
            r1.append(r2)
            java.lang.String r10 = r10.getName()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10, r11)
            throw r0
        L151:
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r10 = new com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            r10.<init>(r9, r0)
            return r10
        L157:
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            r0.<init>(r9, r10, r11)
            return r0
    }

    public java.lang.ClassLoader getDefaultClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = r1.defaultClassLoader
            return r0
    }

    public com.alibaba.fastjson.parser.deserializer.ObjectDeserializer getDeserializer(com.alibaba.fastjson.util.FieldInfo r2) {
            r1 = this;
            java.lang.Class<?> r0 = r2.fieldClass
            java.lang.reflect.Type r2 = r2.fieldType
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r2 = r1.getDeserializer(r0, r2)
            return r2
    }

    public com.alibaba.fastjson.parser.deserializer.ObjectDeserializer getDeserializer(java.lang.Class<?> r7, java.lang.reflect.Type r8) {
            r6 = this;
            java.lang.String r0 = "java.util.Optional"
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers
            java.lang.Object r1 = r1.get(r8)
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            if (r8 != 0) goto L10
            r8 = r7
        L10:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers
            java.lang.Object r1 = r1.get(r8)
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r1
            if (r1 == 0) goto L1b
            return r1
        L1b:
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r2 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r2 = r7.getAnnotation(r2)
            com.alibaba.fastjson.annotation.JSONType r2 = (com.alibaba.fastjson.annotation.JSONType) r2
            if (r2 == 0) goto L32
            java.lang.Class r2 = r2.mappingTo()
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r2 == r3) goto L32
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r7 = r6.getDeserializer(r2, r2)
            return r7
        L32:
            boolean r2 = r8 instanceof java.lang.reflect.WildcardType
            if (r2 != 0) goto L3e
            boolean r2 = r8 instanceof java.lang.reflect.TypeVariable
            if (r2 != 0) goto L3e
            boolean r2 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L46
        L3e:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers
            java.lang.Object r1 = r1.get(r7)
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r1
        L46:
            if (r1 == 0) goto L49
            return r1
        L49:
            java.lang.String r2 = r7.getName()
            r3 = 36
            r4 = 46
            java.lang.String r2 = r2.replace(r3, r4)
            java.lang.String r3 = "java.awt."
            boolean r3 = r2.startsWith(r3)
            r4 = 1
            if (r3 == 0) goto L9b
            boolean r3 = com.alibaba.fastjson.serializer.AwtCodec.support(r7)
            if (r3 == 0) goto L9b
            boolean r3 = com.alibaba.fastjson.parser.ParserConfig.awtError
            if (r3 != 0) goto L9b
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "java.awt.Point"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L97
            com.alibaba.fastjson.serializer.AwtCodec r5 = com.alibaba.fastjson.serializer.AwtCodec.instance     // Catch: java.lang.Throwable -> L97
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L97
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "java.awt.Font"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L97
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L97
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "java.awt.Rectangle"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L97
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L97
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r1 = r6.deserializers     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "java.awt.Color"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L97
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            com.alibaba.fastjson.parser.ParserConfig.awtError = r4
        L99:
            com.alibaba.fastjson.serializer.AwtCodec r1 = com.alibaba.fastjson.serializer.AwtCodec.instance
        L9b:
            boolean r3 = com.alibaba.fastjson.parser.ParserConfig.jdk8Error
            if (r3 != 0) goto L17a
            java.lang.String r3 = "java.time."
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L178
            if (r3 == 0) goto L137
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.LocalDateTime"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec r5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.LocalDate"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.LocalTime"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.ZonedDateTime"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.OffsetDateTime"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.OffsetTime"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.ZoneOffset"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.ZoneRegion"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.ZoneId"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.Period"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.Duration"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.time.Instant"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r0     // Catch: java.lang.Throwable -> L178
        L135:
            r1 = r0
            goto L17a
        L137:
            boolean r3 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> L178
            if (r3 == 0) goto L17a
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r3 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r5 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L178
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.util.OptionalDouble"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r5 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.util.OptionalInt"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r5 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.String r3 = "java.util.OptionalLong"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r5 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L178
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers     // Catch: java.lang.Throwable -> L178
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L178
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r0     // Catch: java.lang.Throwable -> L178
            goto L135
        L178:
            com.alibaba.fastjson.parser.ParserConfig.jdk8Error = r4
        L17a:
            java.lang.String r0 = "java.nio.file.Path"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L189
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers
            com.alibaba.fastjson.serializer.MiscCodec r2 = com.alibaba.fastjson.serializer.MiscCodec.instance
            r0.put(r7, r2)
        L189:
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            if (r7 != r0) goto L194
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers
            com.alibaba.fastjson.serializer.MiscCodec r2 = com.alibaba.fastjson.serializer.MiscCodec.instance
            r0.put(r7, r2)
        L194:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer> r2 = com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer.class
            java.util.Set r0 = com.alibaba.fastjson.util.ServiceLoader.load(r2, r0)     // Catch: java.lang.Exception -> L1cc
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1cc
        L1a6:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L1cc
            if (r2 == 0) goto L1cd
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L1cc
            com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer r2 = (com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer) r2     // Catch: java.lang.Exception -> L1cc
            java.util.Set r3 = r2.getAutowiredFor()     // Catch: java.lang.Exception -> L1cc
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L1cc
        L1ba:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L1cc
            if (r4 == 0) goto L1a6
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L1cc
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4     // Catch: java.lang.Exception -> L1cc
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = r6.deserializers     // Catch: java.lang.Exception -> L1cc
            r5.put(r4, r2)     // Catch: java.lang.Exception -> L1cc
            goto L1ba
        L1cc:
        L1cd:
            if (r1 != 0) goto L1d8
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r6.deserializers
            java.lang.Object r0 = r0.get(r8)
            r1 = r0
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r1
        L1d8:
            if (r1 == 0) goto L1db
            return r1
        L1db:
            boolean r0 = r7.isEnum()
            if (r0 == 0) goto L1e7
            com.alibaba.fastjson.parser.deserializer.EnumDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.EnumDeserializer
            r0.<init>(r7)
            goto L22e
        L1e7:
            boolean r0 = r7.isArray()
            if (r0 == 0) goto L1f0
            com.alibaba.fastjson.serializer.ObjectArrayCodec r0 = com.alibaba.fastjson.serializer.ObjectArrayCodec.instance
            goto L22e
        L1f0:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            if (r7 == r0) goto L22c
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            if (r7 == r0) goto L22c
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            if (r7 == r0) goto L22c
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r7 == r1) goto L22c
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            if (r7 != r1) goto L205
            goto L22c
        L205:
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L20e
            com.alibaba.fastjson.serializer.CollectionCodec r0 = com.alibaba.fastjson.serializer.CollectionCodec.instance
            goto L22e
        L20e:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L219
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r0 = com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance
            goto L22e
        L219:
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L227
            com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer
            r0.<init>(r6, r7)
            goto L22e
        L227:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r6.createJavaBeanDeserializer(r7, r8)
            goto L22e
        L22c:
            com.alibaba.fastjson.serializer.CollectionCodec r0 = com.alibaba.fastjson.serializer.CollectionCodec.instance
        L22e:
            r6.putDeserializer(r8, r0)
            return r0
    }

    public com.alibaba.fastjson.parser.deserializer.ObjectDeserializer getDeserializer(java.lang.reflect.Type r3) {
            r2 = this;
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r2.deserializers
            java.lang.Object r0 = r0.get(r3)
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L17
            r0 = r3
            java.lang.Class r0 = (java.lang.Class) r0
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r2.getDeserializer(r0, r3)
            return r3
        L17:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L32
            r0 = r3
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L2d
            java.lang.Class r0 = (java.lang.Class) r0
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r2.getDeserializer(r0, r3)
            return r3
        L2d:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r2.getDeserializer(r0)
            return r3
        L32:
            com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer r3 = com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer.instance
            return r3
    }

    public com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> getDeserializers() {
            r1 = this;
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r1.deserializers
            return r0
    }

    public void initJavaBeanDeserializers(java.lang.Class<?>... r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L16
        L3:
            int r0 = r5.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L16
            r2 = r5[r1]
            if (r2 != 0) goto Lc
            goto L13
        Lc:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r4.createJavaBeanDeserializer(r2, r2)
            r4.putDeserializer(r2, r3)
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            return
    }

    public boolean isAsmEnable() {
            r1 = this;
            boolean r0 = r1.asmEnable
            return r0
    }

    public boolean isAutoTypeSupport() {
            r1 = this;
            boolean r0 = r1.autoTypeSupport
            return r0
    }

    public boolean isPrimitive(java.lang.Class<?> r1) {
            r0 = this;
            boolean r1 = isPrimitive2(r1)
            return r1
    }

    public void putDeserializer(java.lang.reflect.Type r2, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3) {
            r1 = this;
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r0 = r1.deserializers
            r0.put(r2, r3)
            return
    }

    public void setAsmEnable(boolean r1) {
            r0 = this;
            r0.asmEnable = r1
            return
    }

    public void setAutoTypeSupport(boolean r1) {
            r0 = this;
            r0.autoTypeSupport = r1
            return
    }

    public void setDefaultClassLoader(java.lang.ClassLoader r1) {
            r0 = this;
            r0.defaultClassLoader = r1
            return
    }
}
