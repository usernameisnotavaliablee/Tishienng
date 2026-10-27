package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJsonGet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonGet.kt\ncom/bxkj/base/v2/common/utils/JsonGet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,575:1\n11561#2:576\n11896#2,3:577\n37#3,2:580\n1#4:582\n*S KotlinDebug\n*F\n+ 1 JsonGet.kt\ncom/bxkj/base/v2/common/utils/JsonGet\n*L\n60#1:576\n60#1:577,3\n60#1:580,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class x {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.x a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends com.google.gson.reflect.TypeToken<java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends com.google.gson.reflect.TypeToken<java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
        c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJsonGet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonGet.kt\ncom/bxkj/base/v2/common/utils/JsonGet$jsonToObject$1\n*L\n1#1,575:1\n*E\n"})
    public static final class d<T> extends com.google.gson.reflect.TypeToken<T> {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.bxkj.base.v2.common.utils.x r0 = new com.bxkj.base.v2.common.utils.x
            r0.<init>()
            com.bxkj.base.v2.common.utils.x.a = r0
            return
    }

    private x() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void a(java.lang.StringBuilder r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            if (r0 >= r4) goto Lb
            r1 = 9
            r3.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> A(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            r2 = this;
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.bxkj.base.v2.common.utils.x$c r1 = new com.bxkj.base.v2.common.utils.x$c
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r3 = r0.fromJson(r3, r1)
            java.lang.String r0 = "fromJson(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.util.Map r3 = (java.util.Map) r3
            return r3
    }

    public final /* synthetic */ <T> T B(java.lang.String r3) {
            r2 = this;
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L16
            r0.<init>()     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.g0.w()     // Catch: java.lang.Exception -> L16
            com.bxkj.base.v2.common.utils.x$d r1 = new com.bxkj.base.v2.common.utils.x$d     // Catch: java.lang.Exception -> L16
            r1.<init>()     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Exception -> L16
            java.lang.Object r3 = r0.fromJson(r3, r1)     // Catch: java.lang.Exception -> L16
            return r3
        L16:
            r3 = 0
            return r3
    }

    public final /* synthetic */ <T> T C(java.lang.Object... r6) {
            r5 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r1) goto L22
            r4 = r6[r3]
            java.lang.Class r4 = r4.getClass()
            r0.add(r4)
            int r3 = r3 + 1
            goto L14
        L22:
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)
            r1 = 1
            r0.setAccessible(r1)
            int r1 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            java.lang.Object r6 = r0.newInstance(r6)
            java.lang.String r0 = "newInstance(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b(@org.jetbrains.annotations.Nullable java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = ""
            if (r9 == 0) goto L6a
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r9)
            if (r1 == 0) goto Lb
            goto L6a
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.length()
            r2 = 0
            r3 = 0
            r4 = 0
        L17:
            if (r2 >= r1) goto L60
            char r5 = r9.charAt(r2)
            r6 = 44
            r7 = 10
            if (r5 == r6) goto L4f
            r3 = 91
            if (r5 == r3) goto L43
            r3 = 93
            if (r5 == r3) goto L37
            r3 = 123(0x7b, float:1.72E-43)
            if (r5 == r3) goto L43
            r3 = 125(0x7d, float:1.75E-43)
            if (r5 == r3) goto L37
            r0.append(r5)
            goto L5c
        L37:
            r0.append(r7)
            int r4 = r4 + (-1)
            r8.a(r0, r4)
            r0.append(r5)
            goto L5c
        L43:
            r0.append(r5)
            r0.append(r7)
            int r4 = r4 + 1
            r8.a(r0, r4)
            goto L5c
        L4f:
            r0.append(r5)
            r6 = 92
            if (r3 == r6) goto L5c
            r0.append(r7)
            r8.a(r0, r4)
        L5c:
            int r2 = r2 + 1
            r3 = r5
            goto L17
        L60:
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r9, r0)
            return r9
        L6a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c(double r3) {
            r2 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.00"
            r0.<init>(r1)
            java.lang.String r3 = r0.format(r3)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    public final boolean d(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.e(r2, r3, r0)
            return r2
    }

    public final boolean e(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.String r1 = r0.t(r1, r2)     // Catch: java.lang.Throwable -> L9
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r3
    }

    public final double f(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            r0 = 0
            double r3 = r2.g(r3, r4, r0)
            return r3
    }

    public final double g(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.String r2, double r3) {
            r0 = this;
            java.lang.String r1 = r0.t(r1, r2)     // Catch: java.lang.Throwable -> L9
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> h(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Le
            goto L55
        Le:
            boolean r1 = r2.w(r4)
            if (r1 == 0) goto L15
            goto L55
        L15:
            boolean r1 = r3.containsKey(r4)
            if (r1 == 0) goto L55
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L22
            goto L55
        L22:
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L29
            java.util.List r3 = (java.util.List) r3
            return r3
        L29:
            boolean r4 = r3 instanceof double[]
            if (r4 == 0) goto L34
            double[] r3 = (double[]) r3
            java.util.List r3 = kotlin.collections.n.Zy(r3)
            return r3
        L34:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L55
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.toString()
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Object r3 = r4.fromJson(r3, r0)
            java.lang.String r4 = "fromJson(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            double[] r3 = (double[]) r3
            java.util.List r3 = kotlin.collections.n.Zy(r3)
            return r3
        L55:
            return r0
    }

    public final float i(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            float r2 = r1.j(r2, r3, r0)
            return r2
    }

    public final float j(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.String r2, float r3) {
            r0 = this;
            java.lang.String r1 = r0.t(r1, r2)     // Catch: java.lang.Throwable -> L9
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final int k(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            int r2 = r1.l(r2, r3, r0)
            return r2
    }

    public final int l(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r1 = r0.t(r1, r2)     // Catch: java.lang.Throwable -> L9
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> m(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Le
            goto L55
        Le:
            boolean r1 = r2.w(r4)
            if (r1 == 0) goto L15
            goto L55
        L15:
            boolean r1 = r3.containsKey(r4)
            if (r1 == 0) goto L55
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L22
            goto L55
        L22:
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L29
            java.util.List r3 = (java.util.List) r3
            return r3
        L29:
            boolean r4 = r3 instanceof int[]
            if (r4 == 0) goto L34
            int[] r3 = (int[]) r3
            java.util.List r3 = kotlin.collections.n.bz(r3)
            return r3
        L34:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L55
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.toString()
            java.lang.Class<int[]> r0 = int[].class
            java.lang.Object r3 = r4.fromJson(r3, r0)
            java.lang.String r4 = "fromJson(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            int[] r3 = (int[]) r3
            java.util.List r3 = kotlin.collections.n.bz(r3)
            return r3
        L55:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> n(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L29
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Le
            goto L29
        Le:
            boolean r1 = r2.w(r4)
            if (r1 == 0) goto L15
            goto L29
        L15:
            boolean r1 = r3.containsKey(r4)
            if (r1 == 0) goto L29
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L22
            goto L29
        L22:
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L29
            java.util.List r3 = (java.util.List) r3
            return r3
        L29:
            return r0
    }

    public final long o(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            r0 = 0
            long r3 = r2.p(r3, r4, r0)
            return r3
    }

    public final long p(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.String r2, long r3) {
            r0 = this;
            java.lang.String r1 = r0.t(r1, r2)     // Catch: java.lang.Throwable -> L9
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> q(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r3 == 0) goto L29
            int r1 = r3.size()
            if (r1 != 0) goto Le
            goto L29
        Le:
            boolean r1 = r2.w(r4)
            if (r1 == 0) goto L15
            goto L29
        L15:
            boolean r1 = r3.containsKey(r4)
            if (r1 == 0) goto L29
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L22
            goto L29
        L22:
            boolean r4 = r3 instanceof java.util.Map
            if (r4 == 0) goto L29
            java.util.Map r3 = (java.util.Map) r3
            return r3
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String r(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            r0 = this;
            double r1 = r0.f(r1, r2)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = r0.c(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            java.lang.String r1 = "0.00"
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> s(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L2d
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Le
            goto L2d
        Le:
            boolean r1 = r2.w(r4)
            if (r1 == 0) goto L15
            goto L2d
        L15:
            boolean r1 = r3.containsKey(r4)
            if (r1 == 0) goto L2d
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L22
            goto L2d
        L22:
            boolean r4 = kotlin.jvm.internal.u0.F(r3)
            if (r4 == 0) goto L2d
            java.util.List r3 = kotlin.jvm.internal.u0.g(r3)
            return r3
        L2d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String t(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.u(r2, r3, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String u(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r8, r0)
            if (r6 == 0) goto L8d
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lf
            goto L8d
        Lf:
            boolean r0 = r5.w(r7)
            if (r0 == 0) goto L17
            goto L8d
        L17:
            boolean r0 = r6.containsKey(r7)
            if (r0 == 0) goto L8d
            java.lang.Object r6 = r6.get(r7)
            if (r6 != 0) goto L26
            java.lang.String r6 = ""
            return r6
        L26:
            java.lang.String r7 = r6.toString()
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto L48
            java.lang.Number r6 = (java.lang.Number) r6
            float r0 = r6.floatValue()
            float r1 = r6.floatValue()
            long r1 = (long) r1
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L85
            float r6 = r6.floatValue()
            long r6 = (long) r6
            java.lang.String r7 = java.lang.String.valueOf(r6)
            goto L85
        L48:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L66
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            double r2 = r6.doubleValue()
            long r2 = (long) r2
            double r2 = (double) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L85
            double r6 = r6.doubleValue()
            long r6 = (long) r6
            java.lang.String r7 = java.lang.String.valueOf(r6)
            goto L85
        L66:
            boolean r0 = r6 instanceof java.math.BigDecimal
            if (r0 == 0) goto L85
            java.math.BigDecimal r6 = (java.math.BigDecimal) r6
            java.math.BigDecimal r0 = new java.math.BigDecimal
            double r1 = r6.doubleValue()
            long r1 = (long) r1
            double r1 = (double) r1
            r0.<init>(r1)
            int r0 = r6.compareTo(r0)
            if (r0 != 0) goto L85
            long r6 = r6.longValue()
            java.lang.String r7 = java.lang.String.valueOf(r6)
        L85:
            boolean r6 = r5.w(r7)
            if (r6 == 0) goto L8c
            goto L8d
        L8c:
            return r7
        L8d:
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> v(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L29
            int r1 = r3.size()
            if (r1 != 0) goto Le
            goto L29
        Le:
            boolean r1 = r2.w(r4)
            if (r1 == 0) goto L15
            goto L29
        L15:
            boolean r1 = r3.containsKey(r4)
            if (r1 == 0) goto L29
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L22
            goto L29
        L22:
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L29
            java.util.List r3 = (java.util.List) r3
            return r3
        L29:
            return r0
    }

    public final boolean w(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L16
            java.lang.String r1 = ""
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 != 0) goto L16
            java.lang.String r1 = "null"
            boolean r3 = kotlin.text.u.a2(r3, r1, r0)
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = 0
            return r3
        L16:
            return r0
    }

    public final boolean x(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            java.lang.String r0 = ""
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> y(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L25
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.bxkj.base.v2.common.utils.x$a r1 = new com.bxkj.base.v2.common.utils.x$a
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r3 = r0.fromJson(r3, r1)
            java.lang.String r0 = "fromJson(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.util.List r3 = (java.util.List) r3
            return r3
        L25:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> z(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L25
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.bxkj.base.v2.common.utils.x$b r1 = new com.bxkj.base.v2.common.utils.x$b
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r3 = r0.fromJson(r3, r1)
            java.lang.String r0 = "fromJson(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.util.List r3 = (java.util.List) r3
            return r3
        L25:
            return r0
    }
}
