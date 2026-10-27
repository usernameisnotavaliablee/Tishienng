package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TypeUtils {
    private static java.lang.Class<? extends java.lang.annotation.Annotation> class_OneToMany = null;
    private static boolean class_OneToMany_error = false;
    public static boolean compatibleWithFieldName = false;
    public static boolean compatibleWithJavaBean = false;
    private static java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> mappings = null;
    private static java.lang.reflect.Method method_HibernateIsInitialized = null;
    private static boolean method_HibernateIsInitialized_error = false;
    private static java.lang.Class<?> optionalClass = null;
    private static boolean optionalClassInited = false;
    private static java.lang.reflect.Method oracleDateMethod = null;
    private static boolean oracleDateMethodInited = false;
    private static java.lang.reflect.Method oracleTimestampMethod = null;
    private static boolean oracleTimestampMethodInited = false;
    private static java.lang.Class<?> pathClass = null;
    private static boolean pathClass_error = false;
    private static boolean setAccessibleEnable = true;
    private static java.lang.Class<? extends java.lang.annotation.Annotation> transientClass;
    private static boolean transientClassInited;

    static {
            java.lang.String r0 = "true"
            java.lang.String r1 = "fastjson.compatibleWithJavaBean"
            java.lang.String r1 = com.alibaba.fastjson.util.IOUtils.getStringProperty(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1a
            com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean = r1     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "fastjson.compatibleWithFieldName"
            java.lang.String r1 = com.alibaba.fastjson.util.IOUtils.getStringProperty(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1a
            com.alibaba.fastjson.util.TypeUtils.compatibleWithFieldName = r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 16
            r0.<init>(r3, r1, r2)
            com.alibaba.fastjson.util.TypeUtils.mappings = r0
            addBaseClassMappings()
            r0 = 0
            com.alibaba.fastjson.util.TypeUtils.pathClass_error = r0
            return
    }

    public TypeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addBaseClassMappings() {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "byte"
            java.lang.Class r2 = java.lang.Byte.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "short"
            java.lang.Class r2 = java.lang.Short.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "int"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "long"
            java.lang.Class r2 = java.lang.Long.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "float"
            java.lang.Class r2 = java.lang.Float.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "double"
            java.lang.Class r2 = java.lang.Double.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "boolean"
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "char"
            java.lang.Class r2 = java.lang.Character.TYPE
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[byte"
            java.lang.Class<byte[]> r2 = byte[].class
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[short"
            java.lang.Class<short[]> r3 = short[].class
            r0.put(r1, r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[int"
            java.lang.Class<int[]> r4 = int[].class
            r0.put(r1, r4)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[long"
            java.lang.Class<long[]> r5 = long[].class
            r0.put(r1, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[float"
            java.lang.Class<float[]> r6 = float[].class
            r0.put(r1, r6)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[double"
            java.lang.Class<double[]> r7 = double[].class
            r0.put(r1, r7)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[boolean"
            java.lang.Class<boolean[]> r8 = boolean[].class
            r0.put(r1, r8)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[char"
            java.lang.Class<char[]> r9 = char[].class
            r0.put(r1, r9)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[B"
            r0.put(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[S"
            r0.put(r1, r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[I"
            r0.put(r1, r4)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[J"
            r0.put(r1, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[F"
            r0.put(r1, r6)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[D"
            r0.put(r1, r7)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[C"
            r0.put(r1, r9)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r1 = "[Z"
            r0.put(r1, r8)
            java.lang.String r0 = "java.lang.AutoCloseable"
            java.lang.Class r0 = loadClass(r0)
            java.lang.String r1 = "java.util.concurrent.ConcurrentSkipListMap"
            java.lang.Class r1 = loadClass(r1)
            java.lang.String r2 = "java.util.concurrent.ConcurrentSkipListSet"
            java.lang.Class r2 = loadClass(r2)
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.lang.Class r3 = r3.getClass()
            r4 = 58
            java.lang.Class[] r5 = new java.lang.Class[r4]
            r6 = 0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r5[r6] = r7
            java.lang.Class<java.lang.Cloneable> r7 = java.lang.Cloneable.class
            r8 = 1
            r5[r8] = r7
            r7 = 2
            r5[r7] = r0
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            r7 = 3
            r5[r7] = r0
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            r7 = 4
            r5[r7] = r0
            java.lang.Class<java.lang.IllegalAccessError> r0 = java.lang.IllegalAccessError.class
            r8 = 5
            r5[r8] = r0
            java.lang.Class<java.lang.IllegalAccessException> r0 = java.lang.IllegalAccessException.class
            r8 = 6
            r5[r8] = r0
            java.lang.Class<java.lang.IllegalArgumentException> r0 = java.lang.IllegalArgumentException.class
            r8 = 7
            r5[r8] = r0
            java.lang.Class<java.lang.IllegalMonitorStateException> r0 = java.lang.IllegalMonitorStateException.class
            r8 = 8
            r5[r8] = r0
            java.lang.Class<java.lang.IllegalStateException> r0 = java.lang.IllegalStateException.class
            r8 = 9
            r5[r8] = r0
            java.lang.Class<java.lang.IllegalThreadStateException> r0 = java.lang.IllegalThreadStateException.class
            r8 = 10
            r5[r8] = r0
            java.lang.Class<java.lang.IndexOutOfBoundsException> r0 = java.lang.IndexOutOfBoundsException.class
            r8 = 11
            r5[r8] = r0
            java.lang.Class<java.lang.InstantiationError> r0 = java.lang.InstantiationError.class
            r8 = 12
            r5[r8] = r0
            java.lang.Class<java.lang.InstantiationException> r0 = java.lang.InstantiationException.class
            r8 = 13
            r5[r8] = r0
            java.lang.Class<java.lang.InternalError> r0 = java.lang.InternalError.class
            r8 = 14
            r5[r8] = r0
            java.lang.Class<java.lang.InterruptedException> r0 = java.lang.InterruptedException.class
            r8 = 15
            r5[r8] = r0
            java.lang.Class<java.lang.LinkageError> r0 = java.lang.LinkageError.class
            r8 = 16
            r5[r8] = r0
            java.lang.Class<java.lang.NegativeArraySizeException> r0 = java.lang.NegativeArraySizeException.class
            r8 = 17
            r5[r8] = r0
            java.lang.Class<java.lang.NoClassDefFoundError> r0 = java.lang.NoClassDefFoundError.class
            r8 = 18
            r5[r8] = r0
            java.lang.Class<java.lang.NoSuchFieldError> r0 = java.lang.NoSuchFieldError.class
            r8 = 19
            r5[r8] = r0
            java.lang.Class<java.lang.NoSuchFieldException> r0 = java.lang.NoSuchFieldException.class
            r8 = 20
            r5[r8] = r0
            java.lang.Class<java.lang.NoSuchMethodError> r0 = java.lang.NoSuchMethodError.class
            r8 = 21
            r5[r8] = r0
            java.lang.Class<java.lang.NoSuchMethodException> r0 = java.lang.NoSuchMethodException.class
            r8 = 22
            r5[r8] = r0
            java.lang.Class<java.lang.NullPointerException> r0 = java.lang.NullPointerException.class
            r8 = 23
            r5[r8] = r0
            java.lang.Class<java.lang.NumberFormatException> r0 = java.lang.NumberFormatException.class
            r8 = 24
            r5[r8] = r0
            java.lang.Class<java.lang.OutOfMemoryError> r0 = java.lang.OutOfMemoryError.class
            r8 = 25
            r5[r8] = r0
            java.lang.Class<java.lang.SecurityException> r0 = java.lang.SecurityException.class
            r8 = 26
            r5[r8] = r0
            java.lang.Class<java.lang.StackOverflowError> r0 = java.lang.StackOverflowError.class
            r8 = 27
            r5[r8] = r0
            java.lang.Class<java.lang.StringIndexOutOfBoundsException> r0 = java.lang.StringIndexOutOfBoundsException.class
            r8 = 28
            r5[r8] = r0
            java.lang.Class<java.lang.TypeNotPresentException> r0 = java.lang.TypeNotPresentException.class
            r8 = 29
            r5[r8] = r0
            java.lang.Class<java.lang.VerifyError> r0 = java.lang.VerifyError.class
            r8 = 30
            r5[r8] = r0
            java.lang.Class<java.lang.StackTraceElement> r0 = java.lang.StackTraceElement.class
            r8 = 31
            r5[r8] = r0
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            r8 = 32
            r5[r8] = r0
            java.lang.Class<java.util.Hashtable> r0 = java.util.Hashtable.class
            r8 = 33
            r5[r8] = r0
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            r8 = 34
            r5[r8] = r0
            java.lang.Class<java.util.IdentityHashMap> r0 = java.util.IdentityHashMap.class
            r8 = 35
            r5[r8] = r0
            java.lang.Class<java.util.WeakHashMap> r0 = java.util.WeakHashMap.class
            r8 = 36
            r5[r8] = r0
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            r8 = 37
            r5[r8] = r0
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            r8 = 38
            r5[r8] = r0
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            r8 = 39
            r5[r8] = r0
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            r8 = 40
            r5[r8] = r0
            java.lang.Class<java.util.concurrent.TimeUnit> r0 = java.util.concurrent.TimeUnit.class
            r8 = 41
            r5[r8] = r0
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r0 = java.util.concurrent.ConcurrentHashMap.class
            r8 = 42
            r5[r8] = r0
            r0 = 43
            r5[r0] = r1
            r0 = 44
            r5[r0] = r2
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r0 = java.util.concurrent.atomic.AtomicInteger.class
            r1 = 45
            r5[r1] = r0
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r0 = java.util.concurrent.atomic.AtomicLong.class
            r1 = 46
            r5[r1] = r0
            r0 = 47
            r5[r0] = r3
            java.lang.Class<java.util.BitSet> r0 = java.util.BitSet.class
            r1 = 48
            r5[r1] = r0
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            r1 = 49
            r5[r1] = r0
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r1 = 50
            r5[r1] = r0
            java.lang.Class<java.util.Locale> r0 = java.util.Locale.class
            r1 = 51
            r5[r1] = r0
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            r1 = 52
            r5[r1] = r0
            java.lang.Class<java.sql.Time> r0 = java.sql.Time.class
            r1 = 53
            r5[r1] = r0
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            r1 = 54
            r5[r1] = r0
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            r1 = 55
            r5[r1] = r0
            java.lang.Class<java.text.SimpleDateFormat> r0 = java.text.SimpleDateFormat.class
            r1 = 56
            r5[r1] = r0
            java.lang.Class<com.alibaba.fastjson.JSONObject> r0 = com.alibaba.fastjson.JSONObject.class
            r1 = 57
            r5[r1] = r0
            r0 = 0
        L231:
            if (r0 >= r4) goto L244
            r1 = r5[r0]
            if (r1 != 0) goto L238
            goto L241
        L238:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r2 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r3 = r1.getName()
            r2.put(r3, r1)
        L241:
            int r0 = r0 + 1
            goto L231
        L244:
            java.lang.String r0 = "java.awt.Font"
            java.lang.String r1 = "java.awt.Color"
            java.lang.String r2 = "java.awt.Rectangle"
            java.lang.String r3 = "java.awt.Point"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            r1 = 0
        L251:
            if (r1 >= r7) goto L268
            r2 = r0[r1]
            java.lang.Class r2 = loadClass(r2)
            if (r2 != 0) goto L25c
            goto L268
        L25c:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r3 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r4 = r2.getName()
            r3.put(r4, r2)
            int r1 = r1 + 1
            goto L251
        L268:
            java.lang.String r0 = "org.springframework.remoting.support.RemoteInvocation"
            java.lang.String r1 = "org.springframework.remoting.support.RemoteInvocationResult"
            java.lang.String r2 = "org.springframework.util.LinkedMultiValueMap"
            java.lang.String r3 = "org.springframework.util.LinkedCaseInsensitiveMap"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
        L274:
            if (r6 >= r7) goto L28b
            r1 = r0[r6]
            java.lang.Class r1 = loadClass(r1)
            if (r1 != 0) goto L27f
            goto L28b
        L27f:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r2 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.String r3 = r1.getName()
            r2.put(r3, r1)
            int r6 = r6 + 1
            goto L274
        L28b:
            return
    }

    public static com.alibaba.fastjson.serializer.SerializeBeanInfo buildBeanInfo(java.lang.Class<?> r1, java.util.Map<java.lang.String, java.lang.String> r2, com.alibaba.fastjson.PropertyNamingStrategy r3) {
            r0 = 0
            com.alibaba.fastjson.serializer.SerializeBeanInfo r1 = buildBeanInfo(r1, r2, r3, r0)
            return r1
    }

    public static com.alibaba.fastjson.serializer.SerializeBeanInfo buildBeanInfo(java.lang.Class<?> r12, java.util.Map<java.lang.String, java.lang.String> r13, com.alibaba.fastjson.PropertyNamingStrategy r14, boolean r15) {
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r1 = r12.getAnnotation(r0)
            r3 = r1
            com.alibaba.fastjson.annotation.JSONType r3 = (com.alibaba.fastjson.annotation.JSONType) r3
            r1 = 0
            r2 = 0
            if (r3 == 0) goto L7a
            java.lang.String[] r4 = r3.orders()
            java.lang.String r5 = r3.typeName()
            int r6 = r5.length()
            if (r6 != 0) goto L1c
            r5 = r2
        L1c:
            com.alibaba.fastjson.serializer.SerializerFeature[] r6 = r3.serialzeFeatures()
            int r6 = com.alibaba.fastjson.serializer.SerializerFeature.of(r6)
            java.lang.Class r7 = r12.getSuperclass()
            r8 = r2
        L29:
            if (r7 == 0) goto L48
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r7 == r9) goto L48
            java.lang.annotation.Annotation r9 = r7.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r9 = (com.alibaba.fastjson.annotation.JSONType) r9
            if (r9 != 0) goto L38
            goto L48
        L38:
            java.lang.String r8 = r9.typeKey()
            int r9 = r8.length()
            if (r9 == 0) goto L43
            goto L48
        L43:
            java.lang.Class r7 = r7.getSuperclass()
            goto L29
        L48:
            java.lang.Class[] r7 = r12.getInterfaces()
            int r9 = r7.length
            r10 = 0
        L4e:
            if (r10 >= r9) goto L68
            r11 = r7[r10]
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r11 = (com.alibaba.fastjson.annotation.JSONType) r11
            if (r11 == 0) goto L65
            java.lang.String r8 = r11.typeKey()
            int r11 = r8.length()
            if (r11 == 0) goto L65
            goto L68
        L65:
            int r10 = r10 + 1
            goto L4e
        L68:
            if (r8 == 0) goto L75
            int r0 = r8.length()
            if (r0 != 0) goto L75
            r9 = r2
            r0 = r4
            r8 = r5
            r10 = r6
            goto L7e
        L75:
            r0 = r4
            r10 = r6
            r9 = r8
            r8 = r5
            goto L7e
        L7a:
            r0 = r2
            r8 = r0
            r9 = r8
            r10 = 0
        L7e:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.alibaba.fastjson.parser.ParserConfig.parserAllFieldToCache(r12, r5)
            if (r15 == 0) goto L90
            java.util.List r1 = computeGettersWithFieldBase(r12, r13, r1, r14)
            r2 = r12
            r4 = r13
            r7 = r14
            goto L98
        L90:
            r6 = 0
            r2 = r12
            r4 = r13
            r7 = r14
            java.util.List r1 = computeGetters(r2, r3, r4, r5, r6, r7)
        L98:
            int r12 = r1.size()
            com.alibaba.fastjson.util.FieldInfo[] r12 = new com.alibaba.fastjson.util.FieldInfo[r12]
            r1.toArray(r12)
            if (r0 == 0) goto Lb4
            int r13 = r0.length
            if (r13 == 0) goto Lb4
            if (r15 == 0) goto Lae
            r13 = 1
            java.util.List r13 = computeGettersWithFieldBase(r2, r4, r13, r7)
            goto Lbc
        Lae:
            r6 = 1
            java.util.List r13 = computeGetters(r2, r3, r4, r5, r6, r7)
            goto Lbc
        Lb4:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r1)
            java.util.Collections.sort(r13)
        Lbc:
            int r14 = r13.size()
            com.alibaba.fastjson.util.FieldInfo[] r14 = new com.alibaba.fastjson.util.FieldInfo[r14]
            r13.toArray(r14)
            boolean r13 = java.util.Arrays.equals(r14, r12)
            if (r13 == 0) goto Lcc
            r14 = r12
        Lcc:
            r4 = r3
            r3 = r2
            com.alibaba.fastjson.serializer.SerializeBeanInfo r2 = new com.alibaba.fastjson.serializer.SerializeBeanInfo
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r12
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    public static <T> T cast(java.lang.Object r10, java.lang.Class<T> r11, com.alibaba.fastjson.parser.ParserConfig r12) {
            r0 = 0
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Class r3 = java.lang.Float.TYPE
            java.lang.Class r4 = java.lang.Byte.TYPE
            java.lang.Class r5 = java.lang.Short.TYPE
            java.lang.Class r6 = java.lang.Long.TYPE
            java.lang.Class r7 = java.lang.Integer.TYPE
            r8 = 0
            if (r10 != 0) goto L47
            if (r11 != r7) goto L19
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            return r10
        L19:
            if (r11 != r6) goto L22
            r10 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            return r10
        L22:
            if (r11 != r5) goto L29
            java.lang.Short r10 = java.lang.Short.valueOf(r8)
            return r10
        L29:
            if (r11 != r4) goto L30
            java.lang.Byte r10 = java.lang.Byte.valueOf(r8)
            return r10
        L30:
            if (r11 != r3) goto L38
            r10 = 0
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            return r10
        L38:
            if (r11 != r2) goto L41
            r10 = 0
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            return r10
        L41:
            if (r11 != r1) goto L46
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L46:
            return r0
        L47:
            if (r11 == 0) goto L20b
            java.lang.Class r9 = r10.getClass()
            if (r11 != r9) goto L50
            goto Lb6
        L50:
            boolean r9 = r10 instanceof java.util.Map
            if (r9 == 0) goto L6e
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            if (r11 != r0) goto L59
            goto Lb6
        L59:
            r0 = r10
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r11 != r1) goto L69
            java.lang.String r1 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L69
            goto Lb6
        L69:
            java.lang.Object r10 = castToJavaBean(r0, r11, r12)
            return r10
        L6e:
            boolean r9 = r11.isArray()
            if (r9 == 0) goto Lac
            boolean r9 = r10 instanceof java.util.Collection
            if (r9 == 0) goto La3
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Class r0 = r11.getComponentType()
            int r1 = r10.size()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.util.Iterator r10 = r10.iterator()
        L8a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r10.next()
            java.lang.Class r2 = r11.getComponentType()
            java.lang.Object r1 = cast(r1, r2, r12)
            java.lang.reflect.Array.set(r0, r8, r1)
            int r8 = r8 + 1
            goto L8a
        La2:
            return r0
        La3:
            java.lang.Class<byte[]> r8 = byte[].class
            if (r11 != r8) goto Lac
            byte[] r10 = castToBytes(r10)
            return r10
        Lac:
            java.lang.Class r8 = r10.getClass()
            boolean r8 = r11.isAssignableFrom(r8)
            if (r8 == 0) goto Lb7
        Lb6:
            return r10
        Lb7:
            if (r11 == r1) goto L206
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r11 != r1) goto Lbf
            goto L206
        Lbf:
            if (r11 == r4) goto L201
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r11 != r1) goto Lc7
            goto L201
        Lc7:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r11 == r1) goto L1fc
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r11 != r1) goto Ld1
            goto L1fc
        Ld1:
            if (r11 == r5) goto L1f7
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r11 != r1) goto Ld9
            goto L1f7
        Ld9:
            if (r11 == r7) goto L1f2
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r11 != r1) goto Le1
            goto L1f2
        Le1:
            if (r11 == r6) goto L1ed
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r11 != r1) goto Le9
            goto L1ed
        Le9:
            if (r11 == r3) goto L1e8
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r11 != r1) goto Lf1
            goto L1e8
        Lf1:
            if (r11 == r2) goto L1e3
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r11 != r1) goto Lf9
            goto L1e3
        Lf9:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r11 != r1) goto L102
            java.lang.String r10 = castToString(r10)
            return r10
        L102:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r11 != r1) goto L10b
            java.math.BigDecimal r10 = castToBigDecimal(r10)
            return r10
        L10b:
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r11 != r1) goto L114
            java.math.BigInteger r10 = castToBigInteger(r10)
            return r10
        L114:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r11 != r1) goto L11d
            java.util.Date r10 = castToDate(r10)
            return r10
        L11d:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r11 != r1) goto L126
            java.sql.Date r10 = castToSqlDate(r10)
            return r10
        L126:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r11 != r1) goto L12f
            java.sql.Timestamp r10 = castToTimestamp(r10)
            return r10
        L12f:
            boolean r1 = r11.isEnum()
            if (r1 == 0) goto L13a
            java.lang.Object r10 = castToEnum(r10, r11, r12)
            return r10
        L13a:
            java.lang.Class<java.util.Calendar> r12 = java.util.Calendar.class
            boolean r1 = r12.isAssignableFrom(r11)
            java.lang.String r2 = "can not cast to : "
            if (r1 == 0) goto L178
            java.util.Date r10 = castToDate(r10)
            if (r11 != r12) goto L153
            java.util.TimeZone r11 = com.alibaba.fastjson.JSON.defaultTimeZone
            java.util.Locale r12 = com.alibaba.fastjson.JSON.defaultLocale
            java.util.Calendar r11 = java.util.Calendar.getInstance(r11, r12)
            goto L15a
        L153:
            java.lang.Object r12 = r11.newInstance()     // Catch: java.lang.Exception -> L15e
            java.util.Calendar r12 = (java.util.Calendar) r12     // Catch: java.lang.Exception -> L15e
            r11 = r12
        L15a:
            r11.setTime(r10)
            return r11
        L15e:
            r10 = move-exception
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r11 = r11.getName()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.<init>(r11, r10)
            throw r12
        L178:
            java.lang.String r12 = r11.getName()
            java.lang.String r1 = "javax.xml.datatype.XMLGregorianCalendar"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L19a
            java.util.Date r10 = castToDate(r10)
            java.util.TimeZone r11 = com.alibaba.fastjson.JSON.defaultTimeZone
            java.util.Locale r12 = com.alibaba.fastjson.JSON.defaultLocale
            java.util.Calendar r11 = java.util.Calendar.getInstance(r11, r12)
            r11.setTime(r10)
            com.alibaba.fastjson.serializer.CalendarCodec r10 = com.alibaba.fastjson.serializer.CalendarCodec.instance
            javax.xml.datatype.XMLGregorianCalendar r10 = r10.createXMLGregorianCalendar(r11)
            return r10
        L19a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L1ca
            java.lang.String r10 = (java.lang.String) r10
            int r12 = r10.length()
            if (r12 == 0) goto L1c9
            java.lang.String r12 = "null"
            boolean r12 = r12.equals(r10)
            if (r12 != 0) goto L1c9
            java.lang.String r12 = "NULL"
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L1b7
            goto L1c9
        L1b7:
            java.lang.Class<java.util.Currency> r12 = java.util.Currency.class
            if (r11 != r12) goto L1c0
            java.util.Currency r10 = java.util.Currency.getInstance(r10)
            return r10
        L1c0:
            java.lang.Class<java.util.Locale> r12 = java.util.Locale.class
            if (r11 != r12) goto L1ca
            java.util.Locale r10 = toLocale(r10)
            return r10
        L1c9:
            return r0
        L1ca:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            java.lang.String r11 = r11.getName()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L1e3:
            java.lang.Double r10 = castToDouble(r10)
            return r10
        L1e8:
            java.lang.Float r10 = castToFloat(r10)
            return r10
        L1ed:
            java.lang.Long r10 = castToLong(r10)
            return r10
        L1f2:
            java.lang.Integer r10 = castToInt(r10)
            return r10
        L1f7:
            java.lang.Short r10 = castToShort(r10)
            return r10
        L1fc:
            java.lang.Character r10 = castToChar(r10)
            return r10
        L201:
            java.lang.Byte r10 = castToByte(r10)
            return r10
        L206:
            java.lang.Boolean r10 = castToBoolean(r10)
            return r10
        L20b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "clazz is null"
            r10.<init>(r11)
            throw r10
    }

    public static <T> T cast(java.lang.Object r7, java.lang.reflect.ParameterizedType r8, com.alibaba.fastjson.parser.ParserConfig r9) {
            java.lang.reflect.Type r0 = r8.getRawType()
            java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
            java.lang.Class<java.util.HashSet> r2 = java.util.HashSet.class
            r3 = 0
            java.lang.Class<java.util.Set> r4 = java.util.Set.class
            if (r0 == r4) goto L19
            if (r0 == r2) goto L19
            if (r0 == r1) goto L19
            java.lang.Class<java.util.List> r5 = java.util.List.class
            if (r0 == r5) goto L19
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            if (r0 != r5) goto L54
        L19:
            java.lang.reflect.Type[] r5 = r8.getActualTypeArguments()
            r5 = r5[r3]
            boolean r6 = r7 instanceof java.lang.Iterable
            if (r6 == 0) goto L54
            if (r0 == r4) goto L36
            if (r0 != r2) goto L28
            goto L36
        L28:
            if (r0 != r1) goto L30
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            goto L3b
        L30:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L3b
        L36:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
        L3b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r7.next()
            java.lang.Object r0 = cast(r0, r5, r9)
            r8.add(r0)
            goto L41
        L53:
            return r8
        L54:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r2 = 1
            if (r0 == r1) goto L5d
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            if (r0 != r1) goto L9d
        L5d:
            java.lang.reflect.Type[] r1 = r8.getActualTypeArguments()
            r1 = r1[r3]
            java.lang.reflect.Type[] r4 = r8.getActualTypeArguments()
            r4 = r4[r2]
            boolean r5 = r7 instanceof java.util.Map
            if (r5 == 0) goto L9d
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L7c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r2 = cast(r2, r1, r9)
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = cast(r0, r4, r9)
            r8.put(r2, r0)
            goto L7c
        L9c:
            return r8
        L9d:
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto Lac
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto Lac
            r7 = 0
            return r7
        Lac:
            java.lang.reflect.Type[] r1 = r8.getActualTypeArguments()
            int r1 = r1.length
            if (r1 != r2) goto Lc2
            java.lang.reflect.Type[] r1 = r8.getActualTypeArguments()
            r1 = r1[r3]
            boolean r1 = r1 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Lc2
            java.lang.Object r7 = cast(r7, r0, r9)
            return r7
        Lc2:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "can not cast to : "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
    }

    public static <T> T cast(java.lang.Object r2, java.lang.reflect.Type r3, com.alibaba.fastjson.parser.ParserConfig r4) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Class
            if (r1 == 0) goto Lf
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r2 = cast(r2, r3, r4)
            return r2
        Lf:
            boolean r1 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L1a
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.Object r2 = cast(r2, r3, r4)
            return r2
        L1a:
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L38
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            int r1 = r4.length()
            if (r1 == 0) goto L37
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L37
            java.lang.String r1 = "NULL"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L38
        L37:
            return r0
        L38:
            boolean r4 = r3 instanceof java.lang.reflect.TypeVariable
            if (r4 == 0) goto L3d
            return r2
        L3d:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "can not cast to : "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.math.BigDecimal castToBigDecimal(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.math.BigDecimal
            if (r1 == 0) goto Lb
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            return r3
        Lb:
            boolean r1 = r3 instanceof java.math.BigInteger
            if (r1 == 0) goto L17
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            r0.<init>(r3)
            return r0
        L17:
            java.lang.String r1 = r3.toString()
            int r2 = r1.length()
            if (r2 != 0) goto L22
            return r0
        L22:
            boolean r2 = r3 instanceof java.util.Map
            if (r2 == 0) goto L2f
            java.util.Map r3 = (java.util.Map) r3
            int r3 = r3.size()
            if (r3 != 0) goto L2f
            return r0
        L2f:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r1)
            return r3
    }

    public static java.math.BigInteger castToBigInteger(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.math.BigInteger
            if (r1 == 0) goto Lb
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            return r2
        Lb:
            boolean r1 = r2 instanceof java.lang.Float
            if (r1 != 0) goto L35
            boolean r1 = r2 instanceof java.lang.Double
            if (r1 == 0) goto L14
            goto L35
        L14:
            java.lang.String r2 = r2.toString()
            int r1 = r2.length()
            if (r1 == 0) goto L34
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            goto L34
        L2f:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
        L34:
            return r0
        L35:
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            return r2
    }

    public static java.lang.Boolean castToBoolean(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Boolean
            if (r1 == 0) goto Lb
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
        Lb:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1f
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0 = 1
            if (r3 != r0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L1f:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L8d
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            if (r2 == 0) goto L8c
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L8c
            java.lang.String r2 = "NULL"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3d
            goto L8c
        L3d:
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L89
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            goto L89
        L4e:
            java.lang.String r0 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            goto L86
        L5f:
            java.lang.String r0 = "Y"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L83
            java.lang.String r0 = "T"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            goto L83
        L70:
            java.lang.String r0 = "F"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L80
            java.lang.String r0 = "N"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8d
        L80:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L83:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L86:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L89:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L8c:
            return r0
        L8d:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to boolean, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Byte castToByte(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3a
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.length()
            if (r1 == 0) goto L39
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L39
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            goto L39
        L30:
            byte r3 = java.lang.Byte.parseByte(r3)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L39:
            return r0
        L3a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to byte, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static byte[] castToBytes(java.lang.Object r3) {
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L7
            byte[] r3 = (byte[]) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r3 = (java.lang.String) r3
            byte[] r3 = com.alibaba.fastjson.util.IOUtils.decodeBase64(r3)
            return r3
        L12:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to int, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Character castToChar(java.lang.Object r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Character
            if (r1 == 0) goto Lb
            java.lang.Character r4 = (java.lang.Character) r4
            return r4
        Lb:
            boolean r1 = r4 instanceof java.lang.String
            java.lang.String r2 = "can not cast to char, value : "
            if (r1 == 0) goto L41
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            if (r3 != 0) goto L1b
            return r0
        L1b:
            int r0 = r1.length()
            r3 = 1
            if (r0 != r3) goto L2c
            r4 = 0
            char r4 = r1.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            return r4
        L2c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L41:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static java.util.Date castToDate(java.lang.Object r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Date
            if (r1 == 0) goto Lb
            java.util.Date r7 = (java.util.Date) r7
            return r7
        Lb:
            boolean r1 = r7 instanceof java.util.Calendar
            if (r1 == 0) goto L16
            java.util.Calendar r7 = (java.util.Calendar) r7
            java.util.Date r7 = r7.getTime()
            return r7
        L16:
            boolean r1 = r7 instanceof java.lang.Number
            if (r1 == 0) goto L26
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            java.util.Date r7 = new java.util.Date
            r7.<init>(r0)
            return r7
        L26:
            boolean r1 = r7 instanceof java.lang.String
            java.lang.String r2 = "can not cast to Date, value : "
            if (r1 == 0) goto Lce
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            com.alibaba.fastjson.parser.JSONScanner r3 = new com.alibaba.fastjson.parser.JSONScanner
            r3.<init>(r1)
            r4 = 0
            boolean r4 = r3.scanISO8601DateIfMatch(r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            java.util.Calendar r7 = r3.getCalendar()     // Catch: java.lang.Throwable -> L47
            java.util.Date r7 = r7.getTime()     // Catch: java.lang.Throwable -> L47
            r3.close()
            return r7
        L47:
            r7 = move-exception
            goto Lca
        L4a:
            r3.close()
            java.lang.String r3 = "/Date("
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L68
            java.lang.String r3 = ")/"
            boolean r3 = r1.endsWith(r3)
            if (r3 == 0) goto L68
            int r3 = r1.length()
            int r3 = r3 + (-2)
            r4 = 6
            java.lang.String r1 = r1.substring(r4, r3)
        L68:
            r3 = 45
            int r3 = r1.indexOf(r3)
            r4 = -1
            if (r3 == r4) goto Lbe
            int r7 = r1.length()
            java.lang.String r0 = com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT
            int r0 = r0.length()
            if (r7 != r0) goto L80
            java.lang.String r7 = com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT
            goto L98
        L80:
            int r7 = r1.length()
            r0 = 10
            if (r7 != r0) goto L8b
            java.lang.String r7 = "yyyy-MM-dd"
            goto L98
        L8b:
            int r7 = r1.length()
            r0 = 19
            if (r7 != r0) goto L96
            java.lang.String r7 = "yyyy-MM-dd HH:mm:ss"
            goto L98
        L96:
            java.lang.String r7 = "yyyy-MM-dd HH:mm:ss.SSS"
        L98:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r3 = com.alibaba.fastjson.JSON.defaultLocale
            r0.<init>(r7, r3)
            java.util.TimeZone r7 = com.alibaba.fastjson.JSON.defaultTimeZone
            r0.setTimeZone(r7)
            java.util.Date r7 = r0.parse(r1)     // Catch: java.text.ParseException -> La9
            return r7
        La9:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lbe:
            int r3 = r1.length()
            if (r3 != 0) goto Lc5
            return r0
        Lc5:
            long r3 = java.lang.Long.parseLong(r1)
            goto Ld0
        Lca:
            r3.close()
            throw r7
        Lce:
            r3 = -1
        Ld0:
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L158
            java.lang.Class r1 = r7.getClass()
            java.lang.String r3 = "oracle.sql.TIMESTAMP"
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "toJdbc"
            r5 = 1
            if (r3 == 0) goto L110
            java.lang.reflect.Method r2 = com.alibaba.fastjson.util.TypeUtils.oracleTimestampMethod
            if (r2 != 0) goto Lfe
            boolean r2 = com.alibaba.fastjson.util.TypeUtils.oracleTimestampMethodInited
            if (r2 != 0) goto Lfe
            java.lang.reflect.Method r1 = r1.getMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> Lf7 java.lang.Throwable -> Lfa
            com.alibaba.fastjson.util.TypeUtils.oracleTimestampMethod = r1     // Catch: java.lang.NoSuchMethodException -> Lf7 java.lang.Throwable -> Lfa
        Lf7:
            com.alibaba.fastjson.util.TypeUtils.oracleTimestampMethodInited = r5
            goto Lfe
        Lfa:
            r7 = move-exception
            com.alibaba.fastjson.util.TypeUtils.oracleTimestampMethodInited = r5
            throw r7
        Lfe:
            java.lang.reflect.Method r1 = com.alibaba.fastjson.util.TypeUtils.oracleTimestampMethod     // Catch: java.lang.Exception -> L107
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch: java.lang.Exception -> L107
            java.util.Date r7 = (java.util.Date) r7
            return r7
        L107:
            r7 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "can not cast oracle.sql.TIMESTAMP to Date"
            r0.<init>(r1, r7)
            throw r0
        L110:
            java.lang.String r3 = "oracle.sql.DATE"
            java.lang.String r6 = r1.getName()
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L143
            java.lang.reflect.Method r2 = com.alibaba.fastjson.util.TypeUtils.oracleDateMethod
            if (r2 != 0) goto L131
            boolean r2 = com.alibaba.fastjson.util.TypeUtils.oracleDateMethodInited
            if (r2 != 0) goto L131
            java.lang.reflect.Method r1 = r1.getMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L12a java.lang.Throwable -> L12d
            com.alibaba.fastjson.util.TypeUtils.oracleDateMethod = r1     // Catch: java.lang.NoSuchMethodException -> L12a java.lang.Throwable -> L12d
        L12a:
            com.alibaba.fastjson.util.TypeUtils.oracleDateMethodInited = r5
            goto L131
        L12d:
            r7 = move-exception
            com.alibaba.fastjson.util.TypeUtils.oracleDateMethodInited = r5
            throw r7
        L131:
            java.lang.reflect.Method r1 = com.alibaba.fastjson.util.TypeUtils.oracleDateMethod     // Catch: java.lang.Exception -> L13a
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch: java.lang.Exception -> L13a
            java.util.Date r7 = (java.util.Date) r7
            return r7
        L13a:
            r7 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "can not cast oracle.sql.DATE to Date"
            r0.<init>(r1, r7)
            throw r0
        L143:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L158:
            java.util.Date r7 = new java.util.Date
            r7.<init>(r3)
            return r7
    }

    public static java.lang.Double castToDouble(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L4c
            java.lang.String r3 = r3.toString()
            int r1 = r3.length()
            if (r1 == 0) goto L4b
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L32
            goto L4b
        L32:
            r0 = 44
            int r0 = r3.indexOf(r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = ","
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
        L42:
            double r0 = java.lang.Double.parseDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L4b:
            return r0
        L4c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to double, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static <T> T castToEnum(java.lang.Object r2, java.lang.Class<T> r3, com.alibaba.fastjson.parser.ParserConfig r4) {
            java.lang.String r4 = "can not cast to : "
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L17
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L15
            int r0 = r2.length()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.lang.Enum r2 = java.lang.Enum.valueOf(r3, r2)     // Catch: java.lang.Exception -> L15
            return r2
        L15:
            r2 = move-exception
            goto L44
        L17:
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L2b
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L15
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L15
            java.lang.Object[] r0 = r3.getEnumConstants()     // Catch: java.lang.Exception -> L15
            int r1 = r0.length     // Catch: java.lang.Exception -> L15
            if (r2 >= r1) goto L2b
            r2 = r0[r2]     // Catch: java.lang.Exception -> L15
            return r2
        L2b:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L44:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r2)
            throw r0
    }

    public static java.lang.Float castToFloat(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L4c
            java.lang.String r3 = r3.toString()
            int r1 = r3.length()
            if (r1 == 0) goto L4b
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L32
            goto L4b
        L32:
            r0 = 44
            int r0 = r3.indexOf(r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = ","
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
        L42:
            float r3 = java.lang.Float.parseFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L4b:
            return r0
        L4c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to float, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Integer castToInt(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto Lb
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
        Lb:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L1a:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L51
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.length()
            if (r1 == 0) goto L50
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L50
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L37
            goto L50
        L37:
            r0 = 44
            int r0 = r3.indexOf(r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = ","
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
        L47:
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L50:
            return r0
        L51:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L60
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L60:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L92
            r0 = r3
            java.util.Map r0 = (java.util.Map) r0
            int r1 = r0.size()
            r2 = 2
            if (r1 != r2) goto L92
            java.lang.String r1 = "andIncrement"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L92
            java.lang.String r1 = "andDecrement"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L92
            java.util.Collection r3 = r0.values()
            java.util.Iterator r3 = r3.iterator()
            r3.next()
            java.lang.Object r3 = r3.next()
            java.lang.Integer r3 = castToInt(r3)
            return r3
        L92:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to int, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static <T> T castToJavaBean(java.lang.Object r1, java.lang.Class<T> r2) {
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r1 = cast(r1, r2, r0)
            return r1
    }

    public static <T> T castToJavaBean(java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.Class<T> r5, com.alibaba.fastjson.parser.ParserConfig r6) {
            java.lang.Class<java.lang.StackTraceElement> r0 = java.lang.StackTraceElement.class
            r1 = 0
            if (r5 != r0) goto L32
            java.lang.String r5 = "className"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L115
            java.lang.String r6 = "methodName"
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.Exception -> L115
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = "fileName"
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L115
            java.lang.String r2 = "lineNumber"
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Exception -> L115
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Exception -> L115
            if (r4 != 0) goto L28
            goto L2c
        L28:
            int r1 = r4.intValue()     // Catch: java.lang.Exception -> L115
        L2c:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement     // Catch: java.lang.Exception -> L115
            r4.<init>(r5, r6, r0, r1)     // Catch: java.lang.Exception -> L115
            return r4
        L32:
            java.lang.String r0 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY     // Catch: java.lang.Exception -> L115
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> L115
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> L115
            r3 = 0
            if (r2 == 0) goto L6b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L115
            if (r6 != 0) goto L43
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.global     // Catch: java.lang.Exception -> L115
        L43:
            java.lang.Class r2 = r6.checkAutoType(r0, r3)     // Catch: java.lang.Exception -> L115
            if (r2 == 0) goto L54
            boolean r0 = r2.equals(r5)     // Catch: java.lang.Exception -> L115
            if (r0 != 0) goto L6b
            java.lang.Object r4 = castToJavaBean(r4, r2, r6)     // Catch: java.lang.Exception -> L115
            return r4
        L54:
            java.lang.ClassNotFoundException r4 = new java.lang.ClassNotFoundException     // Catch: java.lang.Exception -> L115
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L115
            r5.<init>()     // Catch: java.lang.Exception -> L115
            r5.append(r0)     // Catch: java.lang.Exception -> L115
            java.lang.String r6 = " not found"
            r5.append(r6)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L115
            r4.<init>(r5)     // Catch: java.lang.Exception -> L115
            throw r4     // Catch: java.lang.Exception -> L115
        L6b:
            boolean r0 = r5.isInterface()     // Catch: java.lang.Exception -> L115
            if (r0 == 0) goto Lab
            boolean r0 = r4 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> L115
            if (r0 == 0) goto L78
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch: java.lang.Exception -> L115
            goto L7e
        L78:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> L115
            r0.<init>(r4)     // Catch: java.lang.Exception -> L115
            r4 = r0
        L7e:
            if (r6 != 0) goto L84
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()     // Catch: java.lang.Exception -> L115
        L84:
            com.alibaba.fastjson.util.IdentityHashMap r6 = r6.getDeserializers()     // Catch: java.lang.Exception -> L115
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Exception -> L115
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r6 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r6     // Catch: java.lang.Exception -> L115
            if (r6 == 0) goto L99
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)     // Catch: java.lang.Exception -> L115
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject(r4, r5)     // Catch: java.lang.Exception -> L115
            return r4
        L99:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L115
            java.lang.ClassLoader r6 = r6.getContextClassLoader()     // Catch: java.lang.Exception -> L115
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L115
            r0[r1] = r5     // Catch: java.lang.Exception -> L115
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r6, r0, r4)     // Catch: java.lang.Exception -> L115
            return r4
        Lab:
            java.lang.Class<java.util.Locale> r0 = java.util.Locale.class
            if (r5 != r0) goto Ld5
            java.lang.String r0 = "language"
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> L115
            java.lang.String r1 = "country"
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Exception -> L115
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> L115
            if (r2 == 0) goto Ld5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L115
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L115
            if (r2 == 0) goto Lcd
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L115
            java.util.Locale r4 = new java.util.Locale     // Catch: java.lang.Exception -> L115
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L115
            return r4
        Lcd:
            if (r1 != 0) goto Ld5
            java.util.Locale r4 = new java.util.Locale     // Catch: java.lang.Exception -> L115
            r4.<init>(r0)     // Catch: java.lang.Exception -> L115
            return r4
        Ld5:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 != r0) goto Le2
            boolean r0 = r4 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> L115
            if (r0 == 0) goto Le2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L115
            return r4
        Le2:
            if (r6 != 0) goto Le8
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()     // Catch: java.lang.Exception -> L115
        Le8:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r6.getDeserializer(r5)     // Catch: java.lang.Exception -> L115
            boolean r1 = r0 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer     // Catch: java.lang.Exception -> L115
            if (r1 == 0) goto Lf3
            r3 = r0
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r3 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r3     // Catch: java.lang.Exception -> L115
        Lf3:
            if (r3 == 0) goto Lfa
            java.lang.Object r4 = r3.createInstance(r4, r6)     // Catch: java.lang.Exception -> L115
            return r4
        Lfa:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L115
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L115
            r6.<init>()     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = "can not get javaBeanDeserializer. "
            r6.append(r0)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L115
            r6.append(r5)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L115
            r4.<init>(r5)     // Catch: java.lang.Exception -> L115
            throw r4     // Catch: java.lang.Exception -> L115
        L115:
            r4 = move-exception
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r6 = r4.getMessage()
            r5.<init>(r6, r4)
            throw r5
    }

    public static java.lang.Long castToLong(java.lang.Object r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L13:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L6a
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            if (r2 == 0) goto L69
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L69
            java.lang.String r2 = "NULL"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L31
            goto L69
        L31:
            r2 = 44
            int r2 = r1.indexOf(r2)
            if (r2 == 0) goto L41
            java.lang.String r2 = ","
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)
        L41:
            long r2 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L4a
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L4a
            return r4
        L4a:
            com.alibaba.fastjson.parser.JSONScanner r2 = new com.alibaba.fastjson.parser.JSONScanner
            r2.<init>(r1)
            r1 = 0
            boolean r1 = r2.scanISO8601DateIfMatch(r1)
            if (r1 == 0) goto L5b
            java.util.Calendar r0 = r2.getCalendar()
        L5b:
            r2.close()
            if (r0 == 0) goto L6a
            long r0 = r0.getTimeInMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L69:
            return r0
        L6a:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L9c
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            int r1 = r0.size()
            r2 = 2
            if (r1 != r2) goto L9c
            java.lang.String r1 = "andIncrement"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L9c
            java.lang.String r1 = "andDecrement"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L9c
            java.util.Collection r4 = r0.values()
            java.util.Iterator r4 = r4.iterator()
            r4.next()
            java.lang.Object r4 = r4.next()
            java.lang.Long r4 = castToLong(r4)
            return r4
        L9c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to long, value : "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static java.lang.Short castToShort(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3a
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.length()
            if (r1 == 0) goto L39
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L39
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            goto L39
        L30:
            short r3 = java.lang.Short.parseShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L39:
            return r0
        L3a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to short, value : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.sql.Date castToSqlDate(java.lang.Object r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.sql.Date
            if (r1 == 0) goto Lb
            java.sql.Date r6 = (java.sql.Date) r6
            return r6
        Lb:
            boolean r1 = r6 instanceof java.util.Date
            if (r1 == 0) goto L1b
            java.sql.Date r0 = new java.sql.Date
            java.util.Date r6 = (java.util.Date) r6
            long r1 = r6.getTime()
            r0.<init>(r1)
            return r0
        L1b:
            boolean r1 = r6 instanceof java.util.Calendar
            if (r1 == 0) goto L2b
            java.sql.Date r0 = new java.sql.Date
            java.util.Calendar r6 = (java.util.Calendar) r6
            long r1 = r6.getTimeInMillis()
            r0.<init>(r1)
            return r0
        L2b:
            boolean r1 = r6 instanceof java.lang.Number
            r2 = 0
            if (r1 == 0) goto L39
            r1 = r6
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            goto L3a
        L39:
            r4 = r2
        L3a:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L94
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
            int r4 = r1.length()
            if (r4 == 0) goto L93
            java.lang.String r4 = "null"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L93
            java.lang.String r4 = "NULL"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L58
            goto L93
        L58:
            boolean r0 = isNumber(r1)
            if (r0 == 0) goto L63
            long r4 = java.lang.Long.parseLong(r1)
            goto L94
        L63:
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            r0.<init>(r1)
            r4 = 0
            boolean r4 = r0.scanISO8601DateIfMatch(r4)
            if (r4 == 0) goto L7c
            java.util.Calendar r0 = r0.getCalendar()
            java.util.Date r0 = r0.getTime()
            long r4 = r0.getTime()
            goto L94
        L7c:
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "can not cast to Timestamp, value : "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L93:
            return r0
        L94:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L9e
            java.sql.Date r6 = new java.sql.Date
            r6.<init>(r4)
            return r6
        L9e:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can not cast to Date, value : "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public static java.lang.String castToString(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.sql.Timestamp castToTimestamp(java.lang.Object r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Calendar
            if (r1 == 0) goto L14
            java.sql.Timestamp r0 = new java.sql.Timestamp
            java.util.Calendar r7 = (java.util.Calendar) r7
            long r1 = r7.getTimeInMillis()
            r0.<init>(r1)
            return r0
        L14:
            boolean r1 = r7 instanceof java.sql.Timestamp
            if (r1 == 0) goto L1b
            java.sql.Timestamp r7 = (java.sql.Timestamp) r7
            return r7
        L1b:
            boolean r1 = r7 instanceof java.util.Date
            if (r1 == 0) goto L2b
            java.sql.Timestamp r0 = new java.sql.Timestamp
            java.util.Date r7 = (java.util.Date) r7
            long r1 = r7.getTime()
            r0.<init>(r1)
            return r0
        L2b:
            boolean r1 = r7 instanceof java.lang.Number
            r2 = 0
            if (r1 == 0) goto L39
            r1 = r7
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            goto L3a
        L39:
            r4 = r2
        L3a:
            boolean r1 = r7 instanceof java.lang.String
            java.lang.String r6 = "can not cast to Timestamp, value : "
            if (r1 == 0) goto L94
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            int r4 = r1.length()
            if (r4 == 0) goto L93
            java.lang.String r4 = "null"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L93
            java.lang.String r4 = "NULL"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5a
            goto L93
        L5a:
            boolean r0 = isNumber(r1)
            if (r0 == 0) goto L65
            long r4 = java.lang.Long.parseLong(r1)
            goto L94
        L65:
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            r0.<init>(r1)
            r4 = 0
            boolean r4 = r0.scanISO8601DateIfMatch(r4)
            if (r4 == 0) goto L7e
            java.util.Calendar r0 = r0.getCalendar()
            java.util.Date r0 = r0.getTime()
            long r4 = r0.getTime()
            goto L94
        L7e:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L93:
            return r0
        L94:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L9e
            java.sql.Timestamp r7 = new java.sql.Timestamp
            r7.<init>(r4)
            return r7
        L9e:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public static void clearClassMapping() {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            r0.clear()
            addBaseClassMappings()
            return
    }

    private static void computeFields(java.lang.Class<?> r19, java.util.Map<java.lang.String, java.lang.String> r20, com.alibaba.fastjson.PropertyNamingStrategy r21, java.util.Map<java.lang.String, com.alibaba.fastjson.util.FieldInfo> r22, java.lang.reflect.Field[] r23) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            int r4 = r3.length
            r5 = 0
            r6 = 0
        Lb:
            if (r6 >= r4) goto L98
            r10 = r3[r6]
            int r7 = r10.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L1b
            goto L94
        L1b:
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r7 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r7 = r10.getAnnotation(r7)
            r17 = r7
            com.alibaba.fastjson.annotation.JSONField r17 = (com.alibaba.fastjson.annotation.JSONField) r17
            java.lang.String r7 = r10.getName()
            r8 = 0
            if (r17 == 0) goto L69
            boolean r9 = r17.serialize()
            if (r9 != 0) goto L33
            goto L94
        L33:
            int r9 = r17.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r11 = r17.serialzeFeatures()
            int r11 = com.alibaba.fastjson.serializer.SerializerFeature.of(r11)
            com.alibaba.fastjson.parser.Feature[] r12 = r17.parseFeatures()
            int r12 = com.alibaba.fastjson.parser.Feature.of(r12)
            java.lang.String r13 = r17.name()
            int r13 = r13.length()
            if (r13 == 0) goto L55
            java.lang.String r7 = r17.name()
        L55:
            java.lang.String r13 = r17.label()
            int r13 = r13.length()
            if (r13 == 0) goto L63
            java.lang.String r8 = r17.label()
        L63:
            r18 = r8
            r13 = r9
            r14 = r11
            r15 = r12
            goto L6e
        L69:
            r18 = r8
            r13 = 0
            r14 = 0
            r15 = 0
        L6e:
            if (r0 == 0) goto L79
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L79
            goto L94
        L79:
            if (r1 == 0) goto L7f
            java.lang.String r7 = r1.translate(r7)
        L7f:
            r8 = r7
            boolean r7 = r2.containsKey(r8)
            if (r7 != 0) goto L94
            com.alibaba.fastjson.util.FieldInfo r7 = new com.alibaba.fastjson.util.FieldInfo
            r12 = 0
            r16 = 0
            r9 = 0
            r11 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.put(r8, r7)
        L94:
            int r6 = r6 + 1
            goto Lb
        L98:
            return
    }

    public static java.util.List<com.alibaba.fastjson.util.FieldInfo> computeGetters(java.lang.Class<?> r25, com.alibaba.fastjson.annotation.JSONType r26, java.util.Map<java.lang.String, java.lang.String> r27, java.util.Map<java.lang.String, java.lang.reflect.Field> r28, boolean r29, com.alibaba.fastjson.PropertyNamingStrategy r30) {
            r4 = r25
            r12 = r27
            r13 = r28
            r14 = r30
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.lang.reflect.Method[] r0 = r4.getMethods()
            int r1 = r0.length
            r16 = 0
            r2 = 0
        L15:
            if (r2 >= r1) goto L349
            r3 = r2
            r2 = r0[r3]
            java.lang.String r5 = r2.getName()
            int r6 = r2.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L30
        L28:
            r18 = r0
            r17 = r1
            r19 = r3
            goto L341
        L30:
            java.lang.Class r6 = r2.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L3d
            goto L28
        L3d:
            java.lang.Class[] r6 = r2.getParameterTypes()
            int r6 = r6.length
            if (r6 == 0) goto L45
            goto L28
        L45:
            java.lang.Class r6 = r2.getReturnType()
            java.lang.Class<java.lang.ClassLoader> r7 = java.lang.ClassLoader.class
            if (r6 != r7) goto L4e
            goto L28
        L4e:
            java.lang.String r6 = r2.getName()
            java.lang.String r7 = "getMetaClass"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L6b
            java.lang.Class r6 = r2.getReturnType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "groovy.lang.MetaClass"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L6b
            goto L28
        L6b:
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r6 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r7 = r2.getAnnotation(r6)
            com.alibaba.fastjson.annotation.JSONField r7 = (com.alibaba.fastjson.annotation.JSONField) r7
            if (r7 != 0) goto L79
            com.alibaba.fastjson.annotation.JSONField r7 = getSuperMethodAnnotation(r4, r2)
        L79:
            r9 = r7
            r11 = 0
            if (r9 == 0) goto Ldf
            boolean r7 = r9.serialize()
            if (r7 != 0) goto L84
            goto L28
        L84:
            r7 = r6
            int r6 = r9.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r9.serialzeFeatures()
            int r8 = com.alibaba.fastjson.serializer.SerializerFeature.of(r8)
            com.alibaba.fastjson.parser.Feature[] r10 = r9.parseFeatures()
            int r10 = com.alibaba.fastjson.parser.Feature.of(r10)
            java.lang.String r17 = r9.name()
            int r17 = r17.length()
            if (r17 == 0) goto Lca
            java.lang.String r5 = r9.name()
            if (r12 == 0) goto Lb3
            java.lang.Object r5 = r12.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto Lb3
            goto L28
        Lb3:
            r7 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r17 = r1
            r1 = r5
            r5 = 0
            r18 = r7
            r7 = r8
            r8 = r10
            r10 = 0
            r19 = r3
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.put(r1, r0)
            goto L341
        Lca:
            r18 = r0
            r17 = r1
            r19 = r3
            java.lang.String r0 = r9.label()
            int r0 = r0.length()
            if (r0 == 0) goto Le9
            java.lang.String r11 = r9.label()
            goto Le9
        Ldf:
            r18 = r0
            r17 = r1
            r19 = r3
            r7 = r6
            r6 = 0
            r8 = 0
            r10 = 0
        Le9:
            java.lang.String r0 = "get"
            boolean r0 = r5.startsWith(r0)
            r20 = 0
            r1 = 3
            if (r0 == 0) goto L23b
            int r0 = r5.length()
            r3 = 4
            if (r0 >= r3) goto Lfd
            goto L341
        Lfd:
            java.lang.String r0 = "getClass"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L107
            goto L341
        L107:
            java.lang.String r0 = "getDeclaringClass"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L117
            boolean r0 = r4.isEnum()
            if (r0 == 0) goto L117
            goto L341
        L117:
            char r0 = r5.charAt(r1)
            boolean r21 = java.lang.Character.isUpperCase(r0)
            if (r21 != 0) goto L125
            r1 = 512(0x200, float:7.17E-43)
            if (r0 <= r1) goto L127
        L125:
            r0 = 3
            goto L158
        L127:
            r1 = 95
            if (r0 != r1) goto L130
            java.lang.String r0 = r5.substring(r3)
            goto L186
        L130:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto L13b
            r0 = 3
            java.lang.String r3 = r5.substring(r0)
            r0 = r3
            goto L186
        L13b:
            r0 = 3
            int r1 = r5.length()
            r0 = 5
            if (r1 < r0) goto L341
            char r0 = r5.charAt(r3)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L341
            r0 = 3
            java.lang.String r1 = r5.substring(r0)
            java.lang.String r1 = decapitalize(r1)
        L156:
            r0 = r1
            goto L186
        L158:
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean
            if (r1 == 0) goto L165
            java.lang.String r1 = r5.substring(r0)
            java.lang.String r1 = decapitalize(r1)
            goto L181
        L165:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r21 = r5.charAt(r0)
            char r0 = java.lang.Character.toLowerCase(r21)
            r1.append(r0)
            java.lang.String r0 = r5.substring(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 3
        L181:
            java.lang.String r1 = getPropertyNameByCompatibleFieldName(r13, r5, r1, r0)
            goto L156
        L186:
            boolean r1 = isJSONTypeIgnore(r4, r0)
            if (r1 == 0) goto L18e
            goto L341
        L18e:
            java.lang.reflect.Field r1 = com.alibaba.fastjson.parser.ParserConfig.getFieldFromCache(r0, r13)
            if (r1 != 0) goto L1b9
            int r3 = r0.length()
            r22 = r1
            r1 = 1
            if (r3 <= r1) goto L1b7
            char r1 = r0.charAt(r1)
            r3 = 65
            if (r1 < r3) goto L1b7
            r3 = 90
            if (r1 > r3) goto L1b7
            r1 = 3
            java.lang.String r3 = r5.substring(r1)
            java.lang.String r3 = decapitalize(r3)
            java.lang.reflect.Field r3 = com.alibaba.fastjson.parser.ParserConfig.getFieldFromCache(r3, r13)
            goto L1be
        L1b7:
            r1 = 3
            goto L1bc
        L1b9:
            r22 = r1
            goto L1b7
        L1bc:
            r3 = r22
        L1be:
            if (r3 == 0) goto L20d
            java.lang.annotation.Annotation r21 = r3.getAnnotation(r7)
            com.alibaba.fastjson.annotation.JSONField r21 = (com.alibaba.fastjson.annotation.JSONField) r21
            if (r21 == 0) goto L20f
            boolean r6 = r21.serialize()
            if (r6 != 0) goto L1d0
            goto L341
        L1d0:
            int r6 = r21.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r21.serialzeFeatures()
            int r8 = com.alibaba.fastjson.serializer.SerializerFeature.of(r8)
            com.alibaba.fastjson.parser.Feature[] r10 = r21.parseFeatures()
            int r10 = com.alibaba.fastjson.parser.Feature.of(r10)
            java.lang.String r22 = r21.name()
            int r22 = r22.length()
            if (r22 == 0) goto L1fe
            java.lang.String r0 = r21.name()
            if (r12 == 0) goto L1fe
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1fe
            goto L341
        L1fe:
            java.lang.String r22 = r21.label()
            int r22 = r22.length()
            if (r22 == 0) goto L20f
            java.lang.String r11 = r21.label()
            goto L20f
        L20d:
            r21 = r20
        L20f:
            if (r12 == 0) goto L21b
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L21b
            goto L341
        L21b:
            if (r14 == 0) goto L221
            java.lang.String r0 = r14.translate(r0)
        L221:
            com.alibaba.fastjson.util.FieldInfo r22 = new com.alibaba.fastjson.util.FieldInfo
            r23 = r5
            r5 = 0
            r1 = r0
            r24 = r7
            r7 = r8
            r8 = r10
            r10 = r21
            r0 = r22
            r14 = r23
            r12 = 3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.put(r1, r0)
            r10 = r8
            r8 = r7
            goto L23f
        L23b:
            r14 = r5
            r24 = r7
            r12 = 3
        L23f:
            java.lang.String r0 = "is"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L24d
            int r0 = r14.length()
            if (r0 >= r12) goto L253
        L24d:
            r12 = r27
        L24f:
            r14 = r30
            goto L341
        L253:
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 == r1) goto L264
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 == r1) goto L264
            goto L24d
        L264:
            r0 = 2
            char r1 = r14.charAt(r0)
            boolean r3 = java.lang.Character.isUpperCase(r1)
            if (r3 == 0) goto L29c
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean
            if (r1 == 0) goto L27c
            java.lang.String r1 = r14.substring(r0)
            java.lang.String r1 = decapitalize(r1)
            goto L297
        L27c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r3 = r14.charAt(r0)
            char r3 = java.lang.Character.toLowerCase(r3)
            r1.append(r3)
            java.lang.String r3 = r14.substring(r12)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L297:
            java.lang.String r0 = getPropertyNameByCompatibleFieldName(r13, r14, r1, r0)
            goto L2ad
        L29c:
            r3 = 95
            if (r1 != r3) goto L2a5
            java.lang.String r0 = r14.substring(r12)
            goto L2ad
        L2a5:
            r3 = 102(0x66, float:1.43E-43)
            if (r1 != r3) goto L24d
            java.lang.String r0 = r14.substring(r0)
        L2ad:
            boolean r1 = isJSONTypeIgnore(r4, r0)
            if (r1 == 0) goto L2b4
            goto L24d
        L2b4:
            java.lang.reflect.Field r1 = com.alibaba.fastjson.parser.ParserConfig.getFieldFromCache(r0, r13)
            if (r1 != 0) goto L2be
            java.lang.reflect.Field r1 = com.alibaba.fastjson.parser.ParserConfig.getFieldFromCache(r14, r13)
        L2be:
            r3 = r1
            if (r3 == 0) goto L31a
            r7 = r24
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r7)
            r20 = r1
            com.alibaba.fastjson.annotation.JSONField r20 = (com.alibaba.fastjson.annotation.JSONField) r20
            if (r20 == 0) goto L31a
            boolean r1 = r20.serialize()
            if (r1 != 0) goto L2d5
            goto L24d
        L2d5:
            int r6 = r20.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = r20.serialzeFeatures()
            int r8 = com.alibaba.fastjson.serializer.SerializerFeature.of(r1)
            com.alibaba.fastjson.parser.Feature[] r1 = r20.parseFeatures()
            int r10 = com.alibaba.fastjson.parser.Feature.of(r1)
            java.lang.String r1 = r20.name()
            int r1 = r1.length()
            if (r1 == 0) goto L305
            java.lang.String r0 = r20.name()
            if (r27 == 0) goto L305
            r12 = r27
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L307
        L303:
            goto L24f
        L305:
            r12 = r27
        L307:
            java.lang.String r1 = r20.label()
            int r1 = r1.length()
            if (r1 == 0) goto L315
            java.lang.String r11 = r20.label()
        L315:
            r7 = r8
            r8 = r10
            r10 = r20
            goto L31d
        L31a:
            r12 = r27
            goto L315
        L31d:
            if (r12 == 0) goto L328
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L328
            goto L303
        L328:
            r14 = r30
            if (r30 == 0) goto L330
            java.lang.String r0 = r14.translate(r0)
        L330:
            r1 = r0
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L338
            goto L341
        L338:
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.put(r1, r0)
        L341:
            int r2 = r19 + 1
            r1 = r17
            r0 = r18
            goto L15
        L349:
            java.lang.reflect.Field[] r0 = r4.getFields()
            computeFields(r4, r12, r14, r15, r0)
            r0 = r29
            java.util.List r0 = getFieldInfos(r4, r0, r15)
            return r0
    }

    public static java.util.List<com.alibaba.fastjson.util.FieldInfo> computeGetters(java.lang.Class<?> r1, java.util.Map<java.lang.String, java.lang.String> r2) {
            r0 = 1
            java.util.List r1 = computeGetters(r1, r2, r0)
            return r1
    }

    public static java.util.List<com.alibaba.fastjson.util.FieldInfo> computeGetters(java.lang.Class<?> r7, java.util.Map<java.lang.String, java.lang.String> r8, boolean r9) {
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            r2 = r0
            com.alibaba.fastjson.annotation.JSONType r2 = (com.alibaba.fastjson.annotation.JSONType) r2
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.alibaba.fastjson.parser.ParserConfig.parserAllFieldToCache(r7, r4)
            com.alibaba.fastjson.PropertyNamingStrategy r6 = com.alibaba.fastjson.PropertyNamingStrategy.CamelCase
            r1 = r7
            r3 = r8
            r5 = r9
            java.util.List r7 = computeGetters(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.util.List<com.alibaba.fastjson.util.FieldInfo> computeGettersWithFieldBase(java.lang.Class<?> r3, java.util.Map<java.lang.String, java.lang.String> r4, boolean r5, com.alibaba.fastjson.PropertyNamingStrategy r6) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = r3
        L6:
            if (r1 == 0) goto L14
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            computeFields(r1, r4, r6, r0, r2)
            java.lang.Class r1 = r1.getSuperclass()
            goto L6
        L14:
            java.util.List r3 = getFieldInfos(r3, r5, r0)
            return r3
    }

    public static java.util.Collection createCollection(java.lang.reflect.Type r3) {
            java.lang.Class r0 = getRawClass(r3)
            java.lang.Class<java.util.AbstractCollection> r1 = java.util.AbstractCollection.class
            if (r0 == r1) goto L87
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            if (r0 != r1) goto Le
            goto L87
        Le:
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L1c
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            return r3
        L1c:
            java.lang.Class<java.util.LinkedHashSet> r1 = java.util.LinkedHashSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L2a
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            return r3
        L2a:
            java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L38
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>()
            return r3
        L38:
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L46
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L46:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L65
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L5c
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0 = 0
            r3 = r3[r0]
            goto L5e
        L5c:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
        L5e:
            java.lang.Class r3 = (java.lang.Class) r3
            java.util.EnumSet r3 = java.util.EnumSet.noneOf(r3)
            return r3
        L65:
            java.lang.Object r3 = r0.newInstance()     // Catch: java.lang.Exception -> L6c
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L6c
            return r3
        L6c:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "create instance error, class "
            r1.append(r2)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
        L87:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
    }

    public static java.lang.String decapitalize(java.lang.String r3) {
            if (r3 == 0) goto L38
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L38
        L9:
            int r0 = r3.length()
            r1 = 1
            r2 = 0
            if (r0 <= r1) goto L26
            char r0 = r3.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L26
            char r0 = r3.charAt(r2)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L26
            return r3
        L26:
            char[] r3 = r3.toCharArray()
            char r0 = r3[r2]
            char r0 = java.lang.Character.toLowerCase(r0)
            r3[r2] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L38:
            return r3
    }

    public static java.lang.Class<?> getClass(java.lang.reflect.Type r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            if (r0 != r1) goto Lb
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        Lb:
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1a
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = r2.getRawType()
            java.lang.Class r2 = getClass(r2)
            return r2
        L1a:
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L2a
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.reflect.Type[] r2 = r2.getBounds()
            r0 = 0
            r2 = r2[r0]
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        L2a:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            return r2
    }

    public static java.lang.Class<?> getClassFromMapping(java.lang.String r1) {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static java.lang.Class<?> getCollectionItemClass(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L3d
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r0 = 0
            r4 = r4[r0]
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L1e
            r1 = r4
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L1e
            r4 = r1[r0]
        L1e:
            boolean r0 = r4 instanceof java.lang.Class
            java.lang.String r1 = "can not create ASMParser"
            if (r0 == 0) goto L37
            java.lang.Class r4 = (java.lang.Class) r4
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L31
            return r4
        L31:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            r4.<init>(r1)
            throw r4
        L37:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            r4.<init>(r1)
            throw r4
        L3d:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
    }

    public static java.lang.reflect.Type getCollectionItemType(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1f
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r0 = 0
            r4 = r4[r0]
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L3b
            r1 = r4
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L3b
            r4 = r1[r0]
            goto L3b
        L1f:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L3a
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "java."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L3a
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r4 = getCollectionItemType(r4)
            goto L3b
        L3a:
            r4 = 0
        L3b:
            if (r4 != 0) goto L3f
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
        L3f:
            return r4
    }

    public static java.lang.reflect.Field getField(java.lang.Class<?> r4, java.lang.String r5, java.lang.reflect.Field[] r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r6[r1]
            java.lang.String r3 = r2.getName()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L11
            return r2
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            java.lang.Class r4 = r4.getSuperclass()
            if (r4 == 0) goto L27
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r4 == r6) goto L27
            java.lang.reflect.Field[] r6 = r4.getDeclaredFields()
            java.lang.reflect.Field r4 = getField(r4, r5, r6)
            return r4
        L27:
            r4 = 0
            return r4
    }

    private static java.util.List<com.alibaba.fastjson.util.FieldInfo> getFieldInfos(java.lang.Class<?> r5, boolean r6, java.util.Map<java.lang.String, com.alibaba.fastjson.util.FieldInfo> r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r1 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r5 = r5.getAnnotation(r1)
            com.alibaba.fastjson.annotation.JSONType r5 = (com.alibaba.fastjson.annotation.JSONType) r5
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.String[] r5 = r5.orders()
            if (r5 == 0) goto L2f
            int r2 = r5.length
            int r3 = r7.size()
            if (r2 != r3) goto L2f
            int r2 = r5.length
            r3 = 0
        L1f:
            if (r3 >= r2) goto L2d
            r4 = r5[r3]
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L2a
            goto L2f
        L2a:
            int r3 = r3 + 1
            goto L1f
        L2d:
            r2 = 1
            goto L33
        L2f:
            r2 = 0
            goto L33
        L31:
            r5 = 0
            goto L2f
        L33:
            if (r2 == 0) goto L46
            int r6 = r5.length
        L36:
            if (r1 >= r6) goto L63
            r2 = r5[r1]
            java.lang.Object r2 = r7.get(r2)
            com.alibaba.fastjson.util.FieldInfo r2 = (com.alibaba.fastjson.util.FieldInfo) r2
            r0.add(r2)
            int r1 = r1 + 1
            goto L36
        L46:
            java.util.Collection r5 = r7.values()
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r5.next()
            com.alibaba.fastjson.util.FieldInfo r7 = (com.alibaba.fastjson.util.FieldInfo) r7
            r0.add(r7)
            goto L4e
        L5e:
            if (r6 == 0) goto L63
            java.util.Collections.sort(r0)
        L63:
            return r0
    }

    public static java.lang.reflect.Type getGenericParamType(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L13
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Type r1 = r1.getGenericSuperclass()
            java.lang.reflect.Type r1 = getGenericParamType(r1)
        L13:
            return r1
    }

    public static int getParserFeatures(java.lang.Class<?> r1) {
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r1 = (com.alibaba.fastjson.annotation.JSONType) r1
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.alibaba.fastjson.parser.Feature[] r1 = r1.parseFeatures()
            int r1 = com.alibaba.fastjson.parser.Feature.of(r1)
            return r1
    }

    private static java.lang.String getPropertyNameByCompatibleFieldName(java.util.Map<java.lang.String, java.lang.reflect.Field> r1, java.lang.String r2, java.lang.String r3, int r4) {
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.compatibleWithFieldName
            if (r0 == 0) goto L15
            boolean r0 = r1.containsKey(r3)
            if (r0 != 0) goto L15
            java.lang.String r2 = r2.substring(r4)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L15
            return r2
        L15:
            return r3
    }

    public static java.lang.Class<?> getRawClass(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L16
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
            java.lang.Class r1 = getRawClass(r1)
            return r1
        L16:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "TODO"
            r1.<init>(r0)
            throw r1
    }

    public static int getSerializeFeatures(java.lang.Class<?> r1) {
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r1 = (com.alibaba.fastjson.annotation.JSONType) r1
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = r1.serialzeFeatures()
            int r1 = com.alibaba.fastjson.serializer.SerializerFeature.of(r1)
            return r1
    }

    public static com.alibaba.fastjson.annotation.JSONField getSuperMethodAnnotation(java.lang.Class<?> r14, java.lang.reflect.Method r15) {
            java.lang.Class[] r0 = r14.getInterfaces()
            int r1 = r0.length
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r2 = com.alibaba.fastjson.annotation.JSONField.class
            r3 = 0
            if (r1 <= 0) goto L57
            java.lang.Class[] r1 = r15.getParameterTypes()
            int r4 = r0.length
            r5 = 0
        L10:
            if (r5 >= r4) goto L57
            r6 = r0[r5]
            java.lang.reflect.Method[] r6 = r6.getMethods()
            int r7 = r6.length
            r8 = 0
        L1a:
            if (r8 >= r7) goto L54
            r9 = r6[r8]
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r11 = r10.length
            int r12 = r1.length
            if (r11 == r12) goto L27
            goto L51
        L27:
            java.lang.String r11 = r9.getName()
            java.lang.String r12 = r15.getName()
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L36
            goto L51
        L36:
            r11 = 0
        L37:
            int r12 = r1.length
            if (r11 >= r12) goto L48
            r12 = r10[r11]
            r13 = r1[r11]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L45
            goto L51
        L45:
            int r11 = r11 + 1
            goto L37
        L48:
            java.lang.annotation.Annotation r9 = r9.getAnnotation(r2)
            com.alibaba.fastjson.annotation.JSONField r9 = (com.alibaba.fastjson.annotation.JSONField) r9
            if (r9 == 0) goto L51
            return r9
        L51:
            int r8 = r8 + 1
            goto L1a
        L54:
            int r5 = r5 + 1
            goto L10
        L57:
            java.lang.Class r14 = r14.getSuperclass()
            r0 = 0
            if (r14 != 0) goto L5f
            return r0
        L5f:
            int r1 = r14.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 == 0) goto Lad
            java.lang.Class[] r1 = r15.getParameterTypes()
            java.lang.reflect.Method[] r14 = r14.getMethods()
            int r4 = r14.length
            r5 = 0
        L73:
            if (r5 >= r4) goto Lad
            r6 = r14[r5]
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r8 = r7.length
            int r9 = r1.length
            if (r8 == r9) goto L80
            goto Laa
        L80:
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = r15.getName()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L8f
            goto Laa
        L8f:
            r8 = 0
        L90:
            int r9 = r1.length
            if (r8 >= r9) goto La1
            r9 = r7[r8]
            r10 = r1[r8]
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9e
            goto Laa
        L9e:
            int r8 = r8 + 1
            goto L90
        La1:
            java.lang.annotation.Annotation r6 = r6.getAnnotation(r2)
            com.alibaba.fastjson.annotation.JSONField r6 = (com.alibaba.fastjson.annotation.JSONField) r6
            if (r6 == 0) goto Laa
            return r6
        Laa:
            int r5 = r5 + 1
            goto L73
        Lad:
            return r0
    }

    public static boolean isAnnotationPresentOneToMany(java.lang.reflect.Method r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Class<? extends java.lang.annotation.Annotation> r1 = com.alibaba.fastjson.util.TypeUtils.class_OneToMany
            if (r1 != 0) goto L18
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.class_OneToMany_error
            if (r1 != 0) goto L18
            java.lang.String r1 = "javax.persistence.OneToMany"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15
            com.alibaba.fastjson.util.TypeUtils.class_OneToMany = r1     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r1 = 1
            com.alibaba.fastjson.util.TypeUtils.class_OneToMany_error = r1
        L18:
            java.lang.Class<? extends java.lang.annotation.Annotation> r1 = com.alibaba.fastjson.util.TypeUtils.class_OneToMany
            if (r1 != 0) goto L1d
            return r0
        L1d:
            boolean r2 = r2.isAnnotationPresent(r1)
            return r2
    }

    public static boolean isGenericParamType(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L6:
            boolean r0 = r2 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Type r2 = r2.getGenericSuperclass()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r2 != r0) goto L16
            return r1
        L16:
            boolean r2 = isGenericParamType(r2)
            return r2
        L1b:
            return r1
    }

    public static boolean isHibernateInitialized(java.lang.Object r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Method r1 = com.alibaba.fastjson.util.TypeUtils.method_HibernateIsInitialized
            r2 = 1
            if (r1 != 0) goto L24
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.method_HibernateIsInitialized_error
            if (r1 != 0) goto L24
            java.lang.String r1 = "org.hibernate.Hibernate"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "isInitialized"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L22
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L22
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson.util.TypeUtils.method_HibernateIsInitialized = r1     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            com.alibaba.fastjson.util.TypeUtils.method_HibernateIsInitialized_error = r2
        L24:
            java.lang.reflect.Method r1 = com.alibaba.fastjson.util.TypeUtils.method_HibernateIsInitialized
            if (r1 == 0) goto L38
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L38
            r3[r0] = r6     // Catch: java.lang.Throwable -> L38
            r6 = 0
            java.lang.Object r6 = r1.invoke(r6, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L38
            return r6
        L38:
            return r2
    }

    private static boolean isJSONTypeIgnore(java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r0 = (com.alibaba.fastjson.annotation.JSONType) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L38
            java.lang.String[] r3 = r0.includes()
            int r4 = r3.length
            if (r4 <= 0) goto L24
            r5 = 0
        L14:
            int r0 = r3.length
            if (r5 >= r0) goto L23
            r0 = r3[r5]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L20
            return r1
        L20:
            int r5 = r5 + 1
            goto L14
        L23:
            return r2
        L24:
            java.lang.String[] r0 = r0.ignores()
            r3 = 0
        L29:
            int r4 = r0.length
            if (r3 >= r4) goto L38
            r4 = r0[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L35
            return r2
        L35:
            int r3 = r3 + 1
            goto L29
        L38:
            java.lang.Class r0 = r5.getSuperclass()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 == r3) goto L51
            java.lang.Class r0 = r5.getSuperclass()
            if (r0 == 0) goto L51
            java.lang.Class r5 = r5.getSuperclass()
            boolean r5 = isJSONTypeIgnore(r5, r6)
            if (r5 == 0) goto L51
            return r2
        L51:
            return r1
    }

    public static boolean isNumber(java.lang.String r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length()
            if (r1 >= r2) goto L24
            char r2 = r4.charAt(r1)
            r3 = 43
            if (r2 == r3) goto L1e
            r3 = 45
            if (r2 != r3) goto L15
            goto L1e
        L15:
            r3 = 48
            if (r2 < r3) goto L1d
            r3 = 57
            if (r2 <= r3) goto L21
        L1d:
            return r0
        L1e:
            if (r1 == 0) goto L21
            return r0
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            r4 = 1
            return r4
    }

    public static boolean isPath(java.lang.Class<?> r1) {
            java.lang.Class<?> r0 = com.alibaba.fastjson.util.TypeUtils.pathClass
            if (r0 != 0) goto L14
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.pathClass_error
            if (r0 != 0) goto L14
            java.lang.String r0 = "java.nio.file.Path"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11
            com.alibaba.fastjson.util.TypeUtils.pathClass = r0     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r0 = 1
            com.alibaba.fastjson.util.TypeUtils.pathClass_error = r0
        L14:
            java.lang.Class<?> r0 = com.alibaba.fastjson.util.TypeUtils.pathClass
            if (r0 == 0) goto L1d
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    public static boolean isProxy(java.lang.Class<?> r6) {
            java.lang.Class[] r6 = r6.getInterfaces()
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L36
            r3 = r6[r2]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "net.sf.cglib.proxy.Factory"
            boolean r4 = r3.equals(r4)
            r5 = 1
            if (r4 != 0) goto L35
            java.lang.String r4 = "org.springframework.cglib.proxy.Factory"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L21
            goto L35
        L21:
            java.lang.String r4 = "javassist.util.proxy.ProxyObject"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L35
            java.lang.String r4 = "org.apache.ibatis.javassist.util.proxy.ProxyObject"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            goto L35
        L32:
            int r2 = r2 + 1
            goto L7
        L35:
            return r5
        L36:
            return r1
    }

    public static boolean isTransient(java.lang.reflect.Method r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.transientClassInited
            r2 = 1
            if (r1 != 0) goto L18
            java.lang.String r1 = "java.beans.Transient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L14
            com.alibaba.fastjson.util.TypeUtils.transientClass = r1     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L14
        L11:
            com.alibaba.fastjson.util.TypeUtils.transientClassInited = r2
            goto L18
        L14:
            r3 = move-exception
            com.alibaba.fastjson.util.TypeUtils.transientClassInited = r2
            throw r3
        L18:
            java.lang.Class<? extends java.lang.annotation.Annotation> r1 = com.alibaba.fastjson.util.TypeUtils.transientClass
            if (r1 == 0) goto L23
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r1)
            if (r3 == 0) goto L23
            r0 = 1
        L23:
            return r0
    }

    public static java.lang.Class<?> loadClass(java.lang.String r1) {
            r0 = 0
            java.lang.Class r1 = loadClass(r1, r0)
            return r1
    }

    public static java.lang.Class<?> loadClass(java.lang.String r5, java.lang.ClassLoader r6) {
            if (r5 == 0) goto L79
            int r0 = r5.length()
            if (r0 != 0) goto L9
            goto L79
        L9:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.TypeUtils.mappings
            java.lang.Object r0 = r0.get(r5)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L14
            return r0
        L14:
            r1 = 0
            char r2 = r5.charAt(r1)
            r3 = 91
            r4 = 1
            if (r2 != r3) goto L2f
            java.lang.String r5 = r5.substring(r4)
            java.lang.Class r5 = loadClass(r5, r6)
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r1)
            java.lang.Class r5 = r5.getClass()
            return r5
        L2f:
            java.lang.String r1 = "L"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L4d
            java.lang.String r1 = ";"
            boolean r1 = r5.endsWith(r1)
            if (r1 == 0) goto L4d
            int r0 = r5.length()
            int r0 = r0 - r4
            java.lang.String r5 = r5.substring(r4, r0)
            java.lang.Class r5 = loadClass(r5, r6)
            return r5
        L4d:
            if (r6 == 0) goto L59
            java.lang.Class r0 = r6.loadClass(r5)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r1 = com.alibaba.fastjson.util.TypeUtils.mappings     // Catch: java.lang.Throwable -> L59
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L59
            return r0
        L59:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6f
            java.lang.ClassLoader r1 = r1.getContextClassLoader()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L6f
            if (r1 == r6) goto L6f
            java.lang.Class r0 = r1.loadClass(r5)     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r6 = com.alibaba.fastjson.util.TypeUtils.mappings     // Catch: java.lang.Throwable -> L6f
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L6f
            return r0
        L6f:
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r6 = com.alibaba.fastjson.util.TypeUtils.mappings     // Catch: java.lang.Throwable -> L78
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L78
        L78:
            return r0
        L79:
            r5 = 0
            return r5
    }

    static void setAccessible(java.lang.reflect.AccessibleObject r1) {
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.setAccessibleEnable
            if (r0 != 0) goto L5
            goto Lb
        L5:
            boolean r0 = r1.isAccessible()
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.security.AccessControlException -> L11
            return
        L11:
            r1 = 0
            com.alibaba.fastjson.util.TypeUtils.setAccessibleEnable = r1
            return
    }

    public static java.util.Locale toLocale(java.lang.String r4) {
            java.lang.String r0 = "_"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L13
            java.util.Locale r0 = new java.util.Locale
            r4 = r4[r1]
            r0.<init>(r4)
            return r0
        L13:
            int r0 = r4.length
            r3 = 2
            if (r0 != r3) goto L21
            java.util.Locale r0 = new java.util.Locale
            r1 = r4[r1]
            r4 = r4[r2]
            r0.<init>(r1, r4)
            return r0
        L21:
            java.util.Locale r0 = new java.util.Locale
            r1 = r4[r1]
            r2 = r4[r2]
            r4 = r4[r3]
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static java.lang.reflect.Type unwrapOptional(java.lang.reflect.Type r3) {
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.optionalClassInited
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.String r1 = "java.util.Optional"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> Ld java.lang.Throwable -> L10
            com.alibaba.fastjson.util.TypeUtils.optionalClass = r1     // Catch: java.lang.Exception -> Ld java.lang.Throwable -> L10
        Ld:
            com.alibaba.fastjson.util.TypeUtils.optionalClassInited = r0
            goto L14
        L10:
            r3 = move-exception
            com.alibaba.fastjson.util.TypeUtils.optionalClassInited = r0
            throw r3
        L14:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2a
            r0 = r3
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            java.lang.Class<?> r2 = com.alibaba.fastjson.util.TypeUtils.optionalClass
            if (r1 != r2) goto L2a
            java.lang.reflect.Type[] r3 = r0.getActualTypeArguments()
            r0 = 0
            r3 = r3[r0]
        L2a:
            return r3
    }
}
