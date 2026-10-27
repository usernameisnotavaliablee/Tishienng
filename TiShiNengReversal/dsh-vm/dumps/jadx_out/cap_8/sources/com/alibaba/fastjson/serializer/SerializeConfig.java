package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SerializeConfig {
    private static boolean awtError;
    public static final com.alibaba.fastjson.serializer.SerializeConfig globalInstance = null;
    private static boolean guavaError;
    private static boolean jdk8Error;
    private static boolean oracleJdbcError;
    private static boolean springfoxError;
    private boolean asm;
    private com.alibaba.fastjson.serializer.ASMSerializerFactory asmFactory;
    private final boolean fieldBased;
    public com.alibaba.fastjson.PropertyNamingStrategy propertyNamingStrategy;
    private final com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> serializers;
    protected java.lang.String typeKey;

    static {
            com.alibaba.fastjson.serializer.SerializeConfig r0 = new com.alibaba.fastjson.serializer.SerializeConfig
            r0.<init>()
            com.alibaba.fastjson.serializer.SerializeConfig.globalInstance = r0
            r0 = 0
            com.alibaba.fastjson.serializer.SerializeConfig.awtError = r0
            com.alibaba.fastjson.serializer.SerializeConfig.jdk8Error = r0
            com.alibaba.fastjson.serializer.SerializeConfig.oracleJdbcError = r0
            com.alibaba.fastjson.serializer.SerializeConfig.springfoxError = r0
            com.alibaba.fastjson.serializer.SerializeConfig.guavaError = r0
            return
    }

    public SerializeConfig() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public SerializeConfig(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SerializeConfig(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            boolean r2 = com.alibaba.fastjson.util.ASMUtils.IS_ANDROID
            r2 = r2 ^ 1
            r1.asm = r2
            java.lang.String r2 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            r1.typeKey = r2
            r1.fieldBased = r3
            com.alibaba.fastjson.util.IdentityHashMap r2 = new com.alibaba.fastjson.util.IdentityHashMap
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3)
            r1.serializers = r2
            boolean r2 = r1.asm     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L27
            com.alibaba.fastjson.serializer.ASMSerializerFactory r2 = new com.alibaba.fastjson.serializer.ASMSerializerFactory     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            r1.asmFactory = r2     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r2 = 0
            r1.asm = r2
        L27:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            com.alibaba.fastjson.serializer.BooleanCodec r3 = com.alibaba.fastjson.serializer.BooleanCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            com.alibaba.fastjson.serializer.CharacterCodec r3 = com.alibaba.fastjson.serializer.CharacterCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            com.alibaba.fastjson.serializer.IntegerCodec r3 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            com.alibaba.fastjson.serializer.IntegerCodec r3 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.alibaba.fastjson.serializer.IntegerCodec r3 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            com.alibaba.fastjson.serializer.LongCodec r3 = com.alibaba.fastjson.serializer.LongCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            com.alibaba.fastjson.serializer.FloatCodec r3 = com.alibaba.fastjson.serializer.FloatCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            com.alibaba.fastjson.serializer.DoubleSerializer r3 = com.alibaba.fastjson.serializer.DoubleSerializer.instance
            r1.put(r2, r3)
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            com.alibaba.fastjson.serializer.BigDecimalCodec r3 = com.alibaba.fastjson.serializer.BigDecimalCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            com.alibaba.fastjson.serializer.BigIntegerCodec r3 = com.alibaba.fastjson.serializer.BigIntegerCodec.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            com.alibaba.fastjson.serializer.StringCodec r3 = com.alibaba.fastjson.serializer.StringCodec.instance
            r1.put(r2, r3)
            java.lang.Class<byte[]> r2 = byte[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<short[]> r2 = short[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<int[]> r2 = int[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<long[]> r2 = long[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<float[]> r2 = float[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<double[]> r2 = double[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<boolean[]> r2 = boolean[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<char[]> r2 = char[].class
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r3 = com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance
            r1.put(r2, r3)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            com.alibaba.fastjson.serializer.ObjectArrayCodec r3 = com.alibaba.fastjson.serializer.ObjectArrayCodec.instance
            r1.put(r2, r3)
            com.alibaba.fastjson.serializer.MiscCodec r2 = com.alibaba.fastjson.serializer.MiscCodec.instance
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r1.put(r3, r2)
            java.lang.Class<java.text.SimpleDateFormat> r3 = java.text.SimpleDateFormat.class
            r1.put(r3, r2)
            com.alibaba.fastjson.serializer.MiscCodec r3 = new com.alibaba.fastjson.serializer.MiscCodec
            r3.<init>()
            java.lang.Class<java.util.Currency> r0 = java.util.Currency.class
            r1.put(r0, r3)
            java.lang.Class<java.util.TimeZone> r3 = java.util.TimeZone.class
            r1.put(r3, r2)
            java.lang.Class<java.net.InetAddress> r3 = java.net.InetAddress.class
            r1.put(r3, r2)
            java.lang.Class<java.net.Inet4Address> r3 = java.net.Inet4Address.class
            r1.put(r3, r2)
            java.lang.Class<java.net.Inet6Address> r3 = java.net.Inet6Address.class
            r1.put(r3, r2)
            java.lang.Class<java.net.InetSocketAddress> r3 = java.net.InetSocketAddress.class
            r1.put(r3, r2)
            java.lang.Class<java.io.File> r3 = java.io.File.class
            r1.put(r3, r2)
            com.alibaba.fastjson.serializer.AppendableSerializer r2 = com.alibaba.fastjson.serializer.AppendableSerializer.instance
            java.lang.Class<java.lang.Appendable> r3 = java.lang.Appendable.class
            r1.put(r3, r2)
            java.lang.Class<java.lang.StringBuffer> r3 = java.lang.StringBuffer.class
            r1.put(r3, r2)
            java.lang.Class<java.lang.StringBuilder> r3 = java.lang.StringBuilder.class
            r1.put(r3, r2)
            com.alibaba.fastjson.serializer.ToStringSerializer r2 = com.alibaba.fastjson.serializer.ToStringSerializer.instance
            java.lang.Class<java.nio.charset.Charset> r3 = java.nio.charset.Charset.class
            r1.put(r3, r2)
            java.lang.Class<java.util.regex.Pattern> r3 = java.util.regex.Pattern.class
            r1.put(r3, r2)
            java.lang.Class<java.util.Locale> r3 = java.util.Locale.class
            r1.put(r3, r2)
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            r1.put(r3, r2)
            java.lang.Class<java.net.URL> r3 = java.net.URL.class
            r1.put(r3, r2)
            java.lang.Class<java.util.UUID> r3 = java.util.UUID.class
            r1.put(r3, r2)
            com.alibaba.fastjson.serializer.AtomicCodec r2 = com.alibaba.fastjson.serializer.AtomicCodec.instance
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r3 = java.util.concurrent.atomic.AtomicBoolean.class
            r1.put(r3, r2)
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r3 = java.util.concurrent.atomic.AtomicInteger.class
            r1.put(r3, r2)
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r3 = java.util.concurrent.atomic.AtomicLong.class
            r1.put(r3, r2)
            com.alibaba.fastjson.serializer.ReferenceCodec r3 = com.alibaba.fastjson.serializer.ReferenceCodec.instance
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r0 = java.util.concurrent.atomic.AtomicReference.class
            r1.put(r0, r3)
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r0 = java.util.concurrent.atomic.AtomicIntegerArray.class
            r1.put(r0, r2)
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r0 = java.util.concurrent.atomic.AtomicLongArray.class
            r1.put(r0, r2)
            java.lang.Class<java.lang.ref.WeakReference> r2 = java.lang.ref.WeakReference.class
            r1.put(r2, r3)
            java.lang.Class<java.lang.ref.SoftReference> r2 = java.lang.ref.SoftReference.class
            r1.put(r2, r3)
            return
    }

    public SerializeConfig(boolean r2) {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0, r2)
            return
    }

    private final com.alibaba.fastjson.serializer.JavaBeanSerializer createASMSerializer(com.alibaba.fastjson.serializer.SerializeBeanInfo r5) throws java.lang.Exception {
            r4 = this;
            com.alibaba.fastjson.serializer.ASMSerializerFactory r0 = r4.asmFactory
            com.alibaba.fastjson.serializer.JavaBeanSerializer r5 = r0.createJavaBeanSerializer(r5)
            r0 = 0
            r1 = 0
        L8:
            com.alibaba.fastjson.serializer.FieldSerializer[] r2 = r5.sortedGetters
            int r3 = r2.length
            if (r1 >= r3) goto L26
            r2 = r2[r1]
            com.alibaba.fastjson.util.FieldInfo r2 = r2.fieldInfo
            java.lang.Class<?> r2 = r2.fieldClass
            boolean r3 = r2.isEnum()
            if (r3 == 0) goto L23
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = r4.getObjectWriter(r2)
            boolean r2 = r2 instanceof com.alibaba.fastjson.serializer.EnumSerializer
            if (r2 != 0) goto L23
            r5.writeDirect = r0
        L23:
            int r1 = r1 + 1
            goto L8
        L26:
            return r5
    }

    private final com.alibaba.fastjson.serializer.ObjectSerializer createJavaBeanSerializer(java.lang.Class<?> r4) {
            r3 = this;
            com.alibaba.fastjson.PropertyNamingStrategy r0 = r3.propertyNamingStrategy
            boolean r1 = r3.fieldBased
            r2 = 0
            com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = com.alibaba.fastjson.util.TypeUtils.buildBeanInfo(r4, r2, r0, r1)
            com.alibaba.fastjson.util.FieldInfo[] r1 = r0.fields
            int r1 = r1.length
            if (r1 != 0) goto L19
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L19
            com.alibaba.fastjson.serializer.MiscCodec r4 = com.alibaba.fastjson.serializer.MiscCodec.instance
            return r4
        L19:
            com.alibaba.fastjson.serializer.ObjectSerializer r4 = r3.createJavaBeanSerializer(r0)
            return r4
    }

    public static com.alibaba.fastjson.serializer.SerializeConfig getGlobalInstance() {
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            return r0
    }

    private com.alibaba.fastjson.serializer.ObjectSerializer getObjectWriter(java.lang.Class<?> r8, boolean r9) {
            r7 = this;
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r0 = r7.serializers
            java.lang.Object r0 = r0.get(r8)
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = (com.alibaba.fastjson.serializer.ObjectSerializer) r0
            java.lang.Class<com.alibaba.fastjson.serializer.AutowiredObjectSerializer> r1 = com.alibaba.fastjson.serializer.AutowiredObjectSerializer.class
            if (r0 != 0) goto L4d
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.ClassCastException -> L45
            java.lang.ClassLoader r0 = r0.getContextClassLoader()     // Catch: java.lang.ClassCastException -> L45
            java.util.Set r0 = com.alibaba.fastjson.util.ServiceLoader.load(r1, r0)     // Catch: java.lang.ClassCastException -> L45
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.ClassCastException -> L45
        L1c:
            boolean r2 = r0.hasNext()     // Catch: java.lang.ClassCastException -> L45
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()     // Catch: java.lang.ClassCastException -> L45
            boolean r3 = r2 instanceof com.alibaba.fastjson.serializer.AutowiredObjectSerializer     // Catch: java.lang.ClassCastException -> L45
            if (r3 != 0) goto L2b
            goto L1c
        L2b:
            com.alibaba.fastjson.serializer.AutowiredObjectSerializer r2 = (com.alibaba.fastjson.serializer.AutowiredObjectSerializer) r2     // Catch: java.lang.ClassCastException -> L45
            java.util.Set r3 = r2.getAutowiredFor()     // Catch: java.lang.ClassCastException -> L45
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.ClassCastException -> L45
        L35:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassCastException -> L45
            if (r4 == 0) goto L1c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassCastException -> L45
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4     // Catch: java.lang.ClassCastException -> L45
            r7.put(r4, r2)     // Catch: java.lang.ClassCastException -> L45
            goto L35
        L45:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r0 = r7.serializers
            java.lang.Object r0 = r0.get(r8)
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = (com.alibaba.fastjson.serializer.ObjectSerializer) r0
        L4d:
            if (r0 != 0) goto L98
            java.lang.Class<com.alibaba.fastjson.JSON> r2 = com.alibaba.fastjson.JSON.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r3 = r3.getContextClassLoader()
            if (r2 == r3) goto L98
            java.util.Set r0 = com.alibaba.fastjson.util.ServiceLoader.load(r1, r2)     // Catch: java.lang.ClassCastException -> L90
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.ClassCastException -> L90
        L67:
            boolean r1 = r0.hasNext()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r1 instanceof com.alibaba.fastjson.serializer.AutowiredObjectSerializer     // Catch: java.lang.ClassCastException -> L90
            if (r2 != 0) goto L76
            goto L67
        L76:
            com.alibaba.fastjson.serializer.AutowiredObjectSerializer r1 = (com.alibaba.fastjson.serializer.AutowiredObjectSerializer) r1     // Catch: java.lang.ClassCastException -> L90
            java.util.Set r2 = r1.getAutowiredFor()     // Catch: java.lang.ClassCastException -> L90
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassCastException -> L90
        L80:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassCastException -> L90
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassCastException -> L90
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3     // Catch: java.lang.ClassCastException -> L90
            r7.put(r3, r1)     // Catch: java.lang.ClassCastException -> L90
            goto L80
        L90:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r0 = r7.serializers
            java.lang.Object r0 = r0.get(r8)
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = (com.alibaba.fastjson.serializer.ObjectSerializer) r0
        L98:
            if (r0 != 0) goto L3e7
            java.lang.String r0 = r8.getName()
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto Lad
            com.alibaba.fastjson.serializer.MapSerializer r9 = com.alibaba.fastjson.serializer.MapSerializer.instance
            r7.put(r8, r9)
            goto L3de
        Lad:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto Lbc
            com.alibaba.fastjson.serializer.ListSerializer r9 = com.alibaba.fastjson.serializer.ListSerializer.instance
            r7.put(r8, r9)
            goto L3de
        Lbc:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto Lcb
            com.alibaba.fastjson.serializer.CollectionCodec r9 = com.alibaba.fastjson.serializer.CollectionCodec.instance
            r7.put(r8, r9)
            goto L3de
        Lcb:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto Lda
            com.alibaba.fastjson.serializer.DateCodec r9 = com.alibaba.fastjson.serializer.DateCodec.instance
            r7.put(r8, r9)
            goto L3de
        Lda:
            java.lang.Class<com.alibaba.fastjson.JSONAware> r1 = com.alibaba.fastjson.JSONAware.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto Le9
            com.alibaba.fastjson.serializer.JSONAwareSerializer r9 = com.alibaba.fastjson.serializer.JSONAwareSerializer.instance
            r7.put(r8, r9)
            goto L3de
        Le9:
            java.lang.Class<com.alibaba.fastjson.serializer.JSONSerializable> r1 = com.alibaba.fastjson.serializer.JSONSerializable.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto Lf8
            com.alibaba.fastjson.serializer.JSONSerializableSerializer r9 = com.alibaba.fastjson.serializer.JSONSerializableSerializer.instance
            r7.put(r8, r9)
            goto L3de
        Lf8:
            java.lang.Class<com.alibaba.fastjson.JSONStreamAware> r1 = com.alibaba.fastjson.JSONStreamAware.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L107
            com.alibaba.fastjson.serializer.MiscCodec r9 = com.alibaba.fastjson.serializer.MiscCodec.instance
            r7.put(r8, r9)
            goto L3de
        L107:
            boolean r1 = r8.isEnum()
            if (r1 != 0) goto L3c1
            java.lang.Class r1 = r8.getSuperclass()
            if (r1 == 0) goto L11f
            java.lang.Class r1 = r8.getSuperclass()
            boolean r1 = r1.isEnum()
            if (r1 == 0) goto L11f
            goto L3c1
        L11f:
            boolean r1 = r8.isArray()
            if (r1 == 0) goto L137
            java.lang.Class r9 = r8.getComponentType()
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = r7.getObjectWriter(r9)
            com.alibaba.fastjson.serializer.ArraySerializer r1 = new com.alibaba.fastjson.serializer.ArraySerializer
            r1.<init>(r9, r0)
            r7.put(r8, r1)
            goto L3de
        L137:
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L159
            r9 = 0
            com.alibaba.fastjson.PropertyNamingStrategy r0 = r7.propertyNamingStrategy
            com.alibaba.fastjson.serializer.SerializeBeanInfo r9 = com.alibaba.fastjson.util.TypeUtils.buildBeanInfo(r8, r9, r0)
            int r0 = r9.features
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            int r1 = r1.mask
            r0 = r0 | r1
            r9.features = r0
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = new com.alibaba.fastjson.serializer.JavaBeanSerializer
            r0.<init>(r9)
            r7.put(r8, r0)
            goto L3de
        L159:
            java.lang.Class<java.util.TimeZone> r1 = java.util.TimeZone.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 != 0) goto L3bb
            java.lang.Class<java.util.Map$Entry> r1 = java.util.Map.Entry.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L16b
            goto L3bb
        L16b:
            java.lang.Class<java.lang.Appendable> r1 = java.lang.Appendable.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L17a
            com.alibaba.fastjson.serializer.AppendableSerializer r9 = com.alibaba.fastjson.serializer.AppendableSerializer.instance
            r7.put(r8, r9)
            goto L3de
        L17a:
            java.lang.Class<java.nio.charset.Charset> r1 = java.nio.charset.Charset.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L189
            com.alibaba.fastjson.serializer.ToStringSerializer r9 = com.alibaba.fastjson.serializer.ToStringSerializer.instance
            r7.put(r8, r9)
            goto L3de
        L189:
            java.lang.Class<java.util.Enumeration> r1 = java.util.Enumeration.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L198
            com.alibaba.fastjson.serializer.EnumerationSerializer r9 = com.alibaba.fastjson.serializer.EnumerationSerializer.instance
            r7.put(r8, r9)
            goto L3de
        L198:
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 != 0) goto L3b5
            java.lang.Class<javax.xml.datatype.XMLGregorianCalendar> r1 = javax.xml.datatype.XMLGregorianCalendar.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L1aa
            goto L3b5
        L1aa:
            java.lang.Class<java.sql.Clob> r1 = java.sql.Clob.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L1b9
            com.alibaba.fastjson.serializer.ClobSeriliazer r9 = com.alibaba.fastjson.serializer.ClobSeriliazer.instance
            r7.put(r8, r9)
            goto L3de
        L1b9:
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.isPath(r8)
            if (r1 == 0) goto L1c6
            com.alibaba.fastjson.serializer.ToStringSerializer r9 = com.alibaba.fastjson.serializer.ToStringSerializer.instance
            r7.put(r8, r9)
            goto L3de
        L1c6:
            java.lang.Class<java.util.Iterator> r1 = java.util.Iterator.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L1d5
            com.alibaba.fastjson.serializer.MiscCodec r9 = com.alibaba.fastjson.serializer.MiscCodec.instance
            r7.put(r8, r9)
            goto L3de
        L1d5:
            java.lang.String r1 = "java.awt."
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            if (r1 == 0) goto L214
            boolean r1 = com.alibaba.fastjson.serializer.AwtCodec.support(r8)
            if (r1 == 0) goto L214
            boolean r8 = com.alibaba.fastjson.serializer.SerializeConfig.awtError
            if (r8 != 0) goto L211
            java.lang.String r8 = "java.awt.Color"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L20f
            com.alibaba.fastjson.serializer.AwtCodec r9 = com.alibaba.fastjson.serializer.AwtCodec.instance     // Catch: java.lang.Throwable -> L20f
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L20f
            java.lang.String r8 = "java.awt.Font"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L20f
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L20f
            java.lang.String r8 = "java.awt.Point"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L20f
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L20f
            java.lang.String r8 = "java.awt.Rectangle"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L20f
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L20f
            goto L211
        L20f:
            com.alibaba.fastjson.serializer.SerializeConfig.awtError = r2
        L211:
            com.alibaba.fastjson.serializer.AwtCodec r8 = com.alibaba.fastjson.serializer.AwtCodec.instance
            return r8
        L214:
            boolean r1 = com.alibaba.fastjson.serializer.SerializeConfig.jdk8Error
            if (r1 != 0) goto L2e4
            java.lang.String r1 = "java.time."
            boolean r1 = r0.startsWith(r1)
            java.lang.String r3 = "java.util.Optional"
            java.lang.String r4 = "java.util.concurrent.atomic.DoubleAdder"
            java.lang.String r5 = "java.util.concurrent.atomic.LongAdder"
            if (r1 != 0) goto L238
            boolean r1 = r0.startsWith(r3)
            if (r1 != 0) goto L238
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L238
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L2e4
        L238:
            java.lang.String r1 = "java.time.LocalDateTime"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec r6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.LocalDate"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.LocalTime"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.ZonedDateTime"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.OffsetDateTime"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.OffsetTime"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.ZoneOffset"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.ZoneRegion"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.Period"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.Duration"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.time.Instant"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r6)     // Catch: java.lang.Throwable -> L2e2
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r3 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.util.OptionalDouble"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r3 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.util.OptionalInt"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r3 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = "java.util.OptionalLong"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r3 = com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L2e2
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.serializer.AdderSerializer r3 = com.alibaba.fastjson.serializer.AdderSerializer.instance     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L2e2
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L2e2
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r1 = r7.serializers     // Catch: java.lang.Throwable -> L2e2
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L2e2
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = (com.alibaba.fastjson.serializer.ObjectSerializer) r1     // Catch: java.lang.Throwable -> L2e2
            if (r1 == 0) goto L2e4
            return r1
        L2e2:
            com.alibaba.fastjson.serializer.SerializeConfig.jdk8Error = r2
        L2e4:
            boolean r1 = com.alibaba.fastjson.serializer.SerializeConfig.oracleJdbcError
            if (r1 != 0) goto L311
            java.lang.String r1 = "oracle.sql."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L311
            java.lang.String r1 = "oracle.sql.DATE"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L30f
            com.alibaba.fastjson.serializer.DateCodec r3 = com.alibaba.fastjson.serializer.DateCodec.instance     // Catch: java.lang.Throwable -> L30f
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r1 = "oracle.sql.TIMESTAMP"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L30f
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L30f
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r1 = r7.serializers     // Catch: java.lang.Throwable -> L30f
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L30f
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = (com.alibaba.fastjson.serializer.ObjectSerializer) r1     // Catch: java.lang.Throwable -> L30f
            if (r1 == 0) goto L311
            return r1
        L30f:
            com.alibaba.fastjson.serializer.SerializeConfig.oracleJdbcError = r2
        L311:
            boolean r1 = com.alibaba.fastjson.serializer.SerializeConfig.springfoxError
            if (r1 != 0) goto L333
            java.lang.String r1 = "springfox.documentation.spring.web.json.Json"
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L333
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L331
            com.alibaba.fastjson.support.springfox.SwaggerJsonSerializer r3 = com.alibaba.fastjson.support.springfox.SwaggerJsonSerializer.instance     // Catch: java.lang.ClassNotFoundException -> L331
            r7.put(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L331
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r1 = r7.serializers     // Catch: java.lang.ClassNotFoundException -> L331
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.ClassNotFoundException -> L331
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = (com.alibaba.fastjson.serializer.ObjectSerializer) r1     // Catch: java.lang.ClassNotFoundException -> L331
            if (r1 == 0) goto L333
            return r1
        L331:
            com.alibaba.fastjson.serializer.SerializeConfig.springfoxError = r2
        L333:
            boolean r1 = com.alibaba.fastjson.serializer.SerializeConfig.guavaError
            if (r1 != 0) goto L368
            java.lang.String r1 = "com.google.common.collect."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L368
            java.lang.Class<com.google.common.collect.HashMultimap> r1 = com.google.common.collect.HashMultimap.class
            com.alibaba.fastjson.serializer.GuavaCodec r3 = com.alibaba.fastjson.serializer.GuavaCodec.instance     // Catch: java.lang.ClassNotFoundException -> L366
            r7.put(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L366
            java.lang.Class<com.google.common.collect.LinkedListMultimap> r1 = com.google.common.collect.LinkedListMultimap.class
            com.alibaba.fastjson.serializer.GuavaCodec r3 = com.alibaba.fastjson.serializer.GuavaCodec.instance     // Catch: java.lang.ClassNotFoundException -> L366
            r7.put(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L366
            java.lang.Class<com.google.common.collect.ArrayListMultimap> r1 = com.google.common.collect.ArrayListMultimap.class
            com.alibaba.fastjson.serializer.GuavaCodec r3 = com.alibaba.fastjson.serializer.GuavaCodec.instance     // Catch: java.lang.ClassNotFoundException -> L366
            r7.put(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L366
            java.lang.Class<com.google.common.collect.TreeMultimap> r1 = com.google.common.collect.TreeMultimap.class
            com.alibaba.fastjson.serializer.GuavaCodec r3 = com.alibaba.fastjson.serializer.GuavaCodec.instance     // Catch: java.lang.ClassNotFoundException -> L366
            r7.put(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L366
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r1 = r7.serializers     // Catch: java.lang.ClassNotFoundException -> L366
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.ClassNotFoundException -> L366
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = (com.alibaba.fastjson.serializer.ObjectSerializer) r1     // Catch: java.lang.ClassNotFoundException -> L366
            if (r1 == 0) goto L368
            return r1
        L366:
            com.alibaba.fastjson.serializer.SerializeConfig.guavaError = r2
        L368:
            java.lang.String r1 = "net.sf.json.JSONNull"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L386
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L37a
            com.alibaba.fastjson.serializer.MiscCodec r1 = com.alibaba.fastjson.serializer.MiscCodec.instance     // Catch: java.lang.ClassNotFoundException -> L37a
            r7.put(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L37a
            goto L37b
        L37a:
        L37b:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r0 = r7.serializers
            java.lang.Object r0 = r0.get(r8)
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = (com.alibaba.fastjson.serializer.ObjectSerializer) r0
            if (r0 == 0) goto L386
            return r0
        L386:
            java.lang.Class[] r0 = r8.getInterfaces()
            int r1 = r0.length
            if (r1 != r2) goto L399
            r1 = 0
            r0 = r0[r1]
            boolean r0 = r0.isAnnotation()
            if (r0 == 0) goto L399
            com.alibaba.fastjson.serializer.AnnotationSerializer r8 = com.alibaba.fastjson.serializer.AnnotationSerializer.instance
            return r8
        L399:
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.isProxy(r8)
            if (r0 == 0) goto L3ab
            java.lang.Class r9 = r8.getSuperclass()
            com.alibaba.fastjson.serializer.ObjectSerializer r9 = r7.getObjectWriter(r9)
            r7.put(r8, r9)
            return r9
        L3ab:
            if (r9 == 0) goto L3de
            com.alibaba.fastjson.serializer.ObjectSerializer r9 = r7.createJavaBeanSerializer(r8)
            r7.put(r8, r9)
            goto L3de
        L3b5:
            com.alibaba.fastjson.serializer.CalendarCodec r9 = com.alibaba.fastjson.serializer.CalendarCodec.instance
            r7.put(r8, r9)
            goto L3de
        L3bb:
            com.alibaba.fastjson.serializer.MiscCodec r9 = com.alibaba.fastjson.serializer.MiscCodec.instance
            r7.put(r8, r9)
            goto L3de
        L3c1:
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r9 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r9 = r8.getAnnotation(r9)
            com.alibaba.fastjson.annotation.JSONType r9 = (com.alibaba.fastjson.annotation.JSONType) r9
            if (r9 == 0) goto L3d9
            boolean r9 = r9.serializeEnumAsJavaBean()
            if (r9 == 0) goto L3d9
            com.alibaba.fastjson.serializer.ObjectSerializer r9 = r7.createJavaBeanSerializer(r8)
            r7.put(r8, r9)
            goto L3de
        L3d9:
            com.alibaba.fastjson.serializer.EnumSerializer r9 = com.alibaba.fastjson.serializer.EnumSerializer.instance
            r7.put(r8, r9)
        L3de:
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r9 = r7.serializers
            java.lang.Object r8 = r9.get(r8)
            r0 = r8
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = (com.alibaba.fastjson.serializer.ObjectSerializer) r0
        L3e7:
            return r0
    }

    public void addFilter(java.lang.Class<?> r3, com.alibaba.fastjson.serializer.SerializeFilter r4) {
            r2 = this;
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = r2.getObjectWriter(r3)
            boolean r1 = r0 instanceof com.alibaba.fastjson.serializer.SerializeFilterable
            if (r1 == 0) goto L21
            com.alibaba.fastjson.serializer.SerializeFilterable r0 = (com.alibaba.fastjson.serializer.SerializeFilterable) r0
            com.alibaba.fastjson.serializer.SerializeConfig r1 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            if (r2 == r1) goto L1e
            com.alibaba.fastjson.serializer.MapSerializer r1 = com.alibaba.fastjson.serializer.MapSerializer.instance
            if (r0 != r1) goto L1e
            com.alibaba.fastjson.serializer.MapSerializer r0 = new com.alibaba.fastjson.serializer.MapSerializer
            r0.<init>()
            r2.put(r3, r0)
            r0.addFilter(r4)
            return
        L1e:
            r0.addFilter(r4)
        L21:
            return
    }

    public void config(java.lang.Class<?> r4, com.alibaba.fastjson.serializer.SerializerFeature r5, boolean r6) {
            r3 = this;
            r0 = 0
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = r3.getObjectWriter(r4, r0)
            if (r0 != 0) goto L28
            r0 = 0
            com.alibaba.fastjson.PropertyNamingStrategy r1 = r3.propertyNamingStrategy
            com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = com.alibaba.fastjson.util.TypeUtils.buildBeanInfo(r4, r0, r1)
            if (r6 == 0) goto L18
            int r6 = r0.features
            int r5 = r5.mask
            r5 = r5 | r6
            r0.features = r5
            goto L20
        L18:
            int r6 = r0.features
            int r5 = r5.mask
            int r5 = ~r5
            r5 = r5 & r6
            r0.features = r5
        L20:
            com.alibaba.fastjson.serializer.ObjectSerializer r5 = r3.createJavaBeanSerializer(r0)
            r3.put(r4, r5)
            return
        L28:
            boolean r1 = r0 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r1 == 0) goto L55
            r1 = r0
            com.alibaba.fastjson.serializer.JavaBeanSerializer r1 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r1
            com.alibaba.fastjson.serializer.SerializeBeanInfo r1 = r1.beanInfo
            int r2 = r1.features
            if (r6 == 0) goto L3b
            int r5 = r5.mask
            r5 = r5 | r2
            r1.features = r5
            goto L41
        L3b:
            int r5 = r5.mask
            int r5 = ~r5
            r5 = r5 & r2
            r1.features = r5
        L41:
            int r5 = r1.features
            if (r2 != r5) goto L46
            goto L55
        L46:
            java.lang.Class r5 = r0.getClass()
            java.lang.Class<com.alibaba.fastjson.serializer.JavaBeanSerializer> r6 = com.alibaba.fastjson.serializer.JavaBeanSerializer.class
            if (r5 == r6) goto L55
            com.alibaba.fastjson.serializer.ObjectSerializer r5 = r3.createJavaBeanSerializer(r1)
            r3.put(r4, r5)
        L55:
            return
    }

    public void configEnumAsJavaBean(java.lang.Class<? extends java.lang.Enum>... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r5[r1]
            com.alibaba.fastjson.serializer.ObjectSerializer r3 = r4.createJavaBeanSerializer(r2)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L2
        L10:
            return
    }

    public com.alibaba.fastjson.serializer.ObjectSerializer createJavaBeanSerializer(com.alibaba.fastjson.serializer.SerializeBeanInfo r15) {
            r14 = this;
            com.alibaba.fastjson.annotation.JSONType r0 = r15.jsonType
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            r2 = 0
            if (r0 == 0) goto L3d
            java.lang.Class r3 = r0.serializer()
            if (r3 == r1) goto L19
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Throwable -> L18
            boolean r4 = r3 instanceof com.alibaba.fastjson.serializer.ObjectSerializer     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L19
            com.alibaba.fastjson.serializer.ObjectSerializer r3 = (com.alibaba.fastjson.serializer.ObjectSerializer) r3     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
        L19:
            boolean r3 = r0.asm()
            if (r3 != 0) goto L21
            r14.asm = r2
        L21:
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r0.serialzeFeatures()
            int r3 = r0.length
            r4 = 0
        L27:
            if (r4 >= r3) goto L3d
            r5 = r0[r4]
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringValueAsString
            if (r6 == r5) goto L3b
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            if (r6 == r5) goto L3b
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue
            if (r6 != r5) goto L38
            goto L3b
        L38:
            int r4 = r4 + 1
            goto L27
        L3b:
            r14.asm = r2
        L3d:
            java.lang.Class<?> r0 = r15.beanType
            int r3 = r0.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
            if (r3 != 0) goto L4f
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = new com.alibaba.fastjson.serializer.JavaBeanSerializer
            r0.<init>(r15)
            return r0
        L4f:
            boolean r3 = r14.asm
            r4 = 1
            if (r3 == 0) goto L5a
            boolean r3 = r14.fieldBased
            if (r3 != 0) goto L5a
            r3 = 1
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 == 0) goto L67
            com.alibaba.fastjson.serializer.ASMSerializerFactory r5 = r14.asmFactory
            com.alibaba.fastjson.util.ASMClassLoader r5 = r5.classLoader
            boolean r5 = r5.isExternalClass(r0)
            if (r5 != 0) goto L6f
        L67:
            java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
            if (r0 == r5) goto L6f
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r0 != r5) goto L70
        L6f:
            r3 = 0
        L70:
            if (r3 == 0) goto L7d
            java.lang.String r5 = r0.getSimpleName()
            boolean r5 = com.alibaba.fastjson.util.ASMUtils.checkName(r5)
            if (r5 != 0) goto L7d
            r3 = 0
        L7d:
            if (r3 == 0) goto Lfe
            com.alibaba.fastjson.util.FieldInfo[] r5 = r15.fields
            int r6 = r5.length
            r7 = 0
        L83:
            if (r7 >= r6) goto Lfe
            r8 = r5[r7]
            java.lang.reflect.Field r9 = r8.field
            if (r9 == 0) goto L99
            java.lang.Class r9 = r9.getType()
            java.lang.Class<?> r10 = r8.fieldClass
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L99
            goto Lff
        L99:
            java.lang.reflect.Method r9 = r8.method
            if (r9 == 0) goto Laa
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class<?> r11 = r8.fieldClass
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto Laa
            goto Lff
        Laa:
            com.alibaba.fastjson.annotation.JSONField r8 = r8.getAnnotation()
            if (r8 != 0) goto Lb1
            goto Lfb
        Lb1:
            java.lang.String r10 = r8.name()
            boolean r10 = com.alibaba.fastjson.util.ASMUtils.checkName(r10)
            if (r10 == 0) goto Lff
            java.lang.String r10 = r8.format()
            int r10 = r10.length()
            if (r10 != 0) goto Lff
            boolean r10 = r8.jsonDirect()
            if (r10 != 0) goto Lff
            java.lang.Class r10 = r8.serializeUsing()
            if (r10 != r1) goto Lff
            boolean r10 = r8.unwrapped()
            if (r10 == 0) goto Ld8
            goto Lff
        Ld8:
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r8.serialzeFeatures()
            int r10 = r8.length
            r11 = 0
        Lde:
            if (r11 >= r10) goto Lf3
            r12 = r8[r11]
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringValueAsString
            if (r13 == r12) goto Lf2
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            if (r13 == r12) goto Lf2
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue
            if (r13 != r12) goto Lef
            goto Lf2
        Lef:
            int r11 = r11 + 1
            goto Lde
        Lf2:
            r3 = 0
        Lf3:
            boolean r8 = com.alibaba.fastjson.util.TypeUtils.isAnnotationPresentOneToMany(r9)
            if (r8 == 0) goto Lfb
            r2 = 1
            goto Lff
        Lfb:
            int r7 = r7 + 1
            goto L83
        Lfe:
            r2 = r3
        Lff:
            if (r2 == 0) goto L120
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = r14.createASMSerializer(r15)     // Catch: java.lang.Throwable -> L108 java.lang.Throwable -> L120
            if (r0 == 0) goto L120
            return r0
        L108:
            r15 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "create asm serializer error, class "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r15)
            throw r1
        L120:
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = new com.alibaba.fastjson.serializer.JavaBeanSerializer
            r0.<init>(r15)
            return r0
    }

    public final com.alibaba.fastjson.serializer.ObjectSerializer get(java.lang.reflect.Type r2) {
            r1 = this;
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r0 = r1.serializers
            java.lang.Object r2 = r0.get(r2)
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = (com.alibaba.fastjson.serializer.ObjectSerializer) r2
            return r2
    }

    public com.alibaba.fastjson.serializer.ObjectSerializer getObjectWriter(java.lang.Class<?> r2) {
            r1 = this;
            r0 = 1
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = r1.getObjectWriter(r2, r0)
            return r2
    }

    public java.lang.String getTypeKey() {
            r1 = this;
            java.lang.String r0 = r1.typeKey
            return r0
    }

    public boolean isAsmEnable() {
            r1 = this;
            boolean r0 = r1.asm
            return r0
    }

    public boolean put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = (com.alibaba.fastjson.serializer.ObjectSerializer) r2
            boolean r1 = r0.put(r1, r2)
            return r1
    }

    public boolean put(java.lang.reflect.Type r2, com.alibaba.fastjson.serializer.ObjectSerializer r3) {
            r1 = this;
            com.alibaba.fastjson.util.IdentityHashMap<java.lang.reflect.Type, com.alibaba.fastjson.serializer.ObjectSerializer> r0 = r1.serializers
            boolean r2 = r0.put(r2, r3)
            return r2
    }

    public void setAsmEnable(boolean r2) {
            r1 = this;
            boolean r0 = com.alibaba.fastjson.util.ASMUtils.IS_ANDROID
            if (r0 == 0) goto L5
            return
        L5:
            r1.asm = r2
            return
    }

    public void setTypeKey(java.lang.String r1) {
            r0 = this;
            r0.typeKey = r1
            return
    }
}
