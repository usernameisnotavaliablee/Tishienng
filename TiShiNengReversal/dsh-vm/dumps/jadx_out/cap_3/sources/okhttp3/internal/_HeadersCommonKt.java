package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n-HeadersCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -HeadersCommon.kt\nokhttp3/internal/_HeadersCommonKt\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n242#2:208\n37#3,2:209\n1#4:211\n*S KotlinDebug\n*F\n+ 1 -HeadersCommon.kt\nokhttp3/internal/_HeadersCommonKt\n*L\n36#1:208\n136#1:209,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class _HeadersCommonKt {
    public _HeadersCommonKt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static final java.lang.String charCode(char r2) {
            r0 = 16
            int r0 = kotlin.text.b.a(r0)
            java.lang.String r2 = java.lang.Integer.toString(r2, r0)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            int r0 = r2.length()
            r1 = 2
            if (r0 >= r1) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 48
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L27:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder commonAdd(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            headersCheckName(r2)
            headersCheckValue(r3, r2)
            commonAddLenient(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder commonAddAll(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r4, @org.jetbrains.annotations.NotNull okhttp3.Headers r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.lang.String r2 = r5.name(r1)
            java.lang.String r3 = r5.value(r1)
            commonAddLenient(r4, r2, r3)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder commonAddLenient(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = r1.getNamesAndValues$okhttp()
            r0.add(r2)
            java.util.List r2 = r1.getNamesAndValues$okhttp()
            java.lang.CharSequence r3 = kotlin.text.u.Z5(r3)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers commonBuild(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers r0 = new okhttp3.Headers
            java.util.List r2 = r2.getNamesAndValues$okhttp()
            java.util.Collection r2 = (java.util.Collection) r2
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2)
            return r0
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okhttp3.Headers r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r2 instanceof okhttp3.Headers
            if (r0 == 0) goto L1b
            java.lang.String[] r1 = r1.getNamesAndValues$okhttp()
            okhttp3.Headers r2 = (okhttp3.Headers) r2
            java.lang.String[] r2 = r2.getNamesAndValues$okhttp()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String commonGet(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r0 = r4.getNamesAndValues$okhttp()
            int r0 = r0.size()
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = kotlin.internal.c.c(r0, r1, r2)
            if (r1 > r0) goto L3e
        L1c:
            java.util.List r2 = r4.getNamesAndValues$okhttp()
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            boolean r2 = kotlin.text.u.a2(r5, r2, r3)
            if (r2 == 0) goto L39
            java.util.List r4 = r4.getNamesAndValues$okhttp()
            int r0 = r0 + r3
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L39:
            if (r0 == r1) goto L3e
            int r0 = r0 + (-2)
            goto L1c
        L3e:
            r4 = 0
            return r4
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okhttp3.Headers r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String[] r1 = r1.getNamesAndValues$okhttp()
            int r1 = java.util.Arrays.hashCode(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String commonHeadersGet(@org.jetbrains.annotations.NotNull java.lang.String[] r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "namesAndValues"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = kotlin.internal.c.c(r0, r1, r2)
            if (r1 > r0) goto L27
        L15:
            r2 = r4[r0]
            r3 = 1
            boolean r2 = kotlin.text.u.a2(r5, r2, r3)
            if (r2 == 0) goto L22
            int r0 = r0 + r3
            r4 = r4[r0]
            return r4
        L22:
            if (r0 == r1) goto L27
            int r0 = r0 + (-2)
            goto L15
        L27:
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers commonHeadersOf(@org.jetbrains.annotations.NotNull java.lang.String... r6) {
            java.lang.String r0 = "inputNamesAndValues"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L51
            int r0 = r6.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L14:
            if (r4 >= r2) goto L31
            r5 = r0[r4]
            if (r5 == 0) goto L29
            r5 = r6[r4]
            java.lang.CharSequence r5 = kotlin.text.u.Z5(r5)
            java.lang.String r5 = r5.toString()
            r0[r4] = r5
            int r4 = r4 + 1
            goto L14
        L29:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Headers cannot be null"
            r6.<init>(r0)
            throw r6
        L31:
            int r6 = r0.length
            int r6 = r6 + (-1)
            int r6 = kotlin.internal.c.c(r3, r6, r1)
            if (r6 < 0) goto L4b
        L3a:
            r1 = r0[r3]
            int r2 = r3 + 1
            r2 = r0[r2]
            headersCheckName(r1)
            headersCheckValue(r2, r1)
            if (r3 == r6) goto L4b
            int r3 = r3 + 2
            goto L3a
        L4b:
            okhttp3.Headers r6 = new okhttp3.Headers
            r6.<init>(r0)
            return r6
        L51:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected alternating header names and values"
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> commonIterator(@org.jetbrains.annotations.NotNull okhttp3.Headers r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r2 = 0
        Lc:
            if (r2 >= r0) goto L1f
            java.lang.String r3 = r5.name(r2)
            java.lang.String r4 = r5.value(r2)
            kotlin.Pair r3 = kotlin.o0.a(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lc
        L1f:
            java.util.Iterator r5 = kotlin.jvm.internal.h.a(r1)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonName(@org.jetbrains.annotations.NotNull okhttp3.Headers r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String[] r2 = r2.getNamesAndValues$okhttp()
            int r0 = r3 * 2
            java.lang.Object r2 = kotlin.collections.n.hf(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "name["
            r0.append(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder commonNewBuilder(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.List r1 = r0.getNamesAndValues$okhttp()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r2 = r2.getNamesAndValues$okhttp()
            kotlin.collections.f0.u0(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder commonRemoveAll(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
        Lb:
            java.util.List r1 = r3.getNamesAndValues$okhttp()
            int r1 = r1.size()
            if (r0 >= r1) goto L39
            java.util.List r1 = r3.getNamesAndValues$okhttp()
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            boolean r1 = kotlin.text.u.a2(r4, r1, r2)
            if (r1 == 0) goto L36
            java.util.List r1 = r3.getNamesAndValues$okhttp()
            r1.remove(r0)
            java.util.List r1 = r3.getNamesAndValues$okhttp()
            r1.remove(r0)
            int r0 = r0 + (-2)
        L36:
            int r0 = r0 + 2
            goto Lb
        L39:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder commonSet(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            headersCheckName(r2)
            headersCheckValue(r3, r2)
            r1.removeAll(r2)
            commonAddLenient(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers commonToHeaders(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            int r0 = r0 * 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L16:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r3 = kotlin.text.u.Z5(r3)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r2 = kotlin.text.u.Z5(r2)
            java.lang.String r2 = r2.toString()
            headersCheckName(r3)
            headersCheckValue(r2, r3)
            r0[r1] = r3
            int r3 = r1 + 1
            r0[r3] = r2
            int r1 = r1 + 2
            goto L16
        L4d:
            okhttp3.Headers r4 = new okhttp3.Headers
            r4.<init>(r0)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okhttp3.Headers r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L34
            java.lang.String r3 = r6.name(r2)
            java.lang.String r4 = r6.value(r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = okhttp3.internal._UtilCommonKt.isSensitiveHeader(r3)
            if (r3 == 0) goto L29
            java.lang.String r4 = "██"
        L29:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L34:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonValue(@org.jetbrains.annotations.NotNull okhttp3.Headers r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String[] r2 = r2.getNamesAndValues$okhttp()
            int r0 = r3 * 2
            int r0 = r0 + 1
            java.lang.Object r2 = kotlin.collections.n.hf(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L16
            return r2
        L16:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "value["
            r0.append(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> commonValues(@org.jetbrains.annotations.NotNull okhttp3.Headers r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.size()
            r1 = 0
            r2 = 0
            r3 = r1
        L11:
            if (r2 >= r0) goto L30
            java.lang.String r4 = r6.name(r2)
            r5 = 1
            boolean r4 = kotlin.text.u.a2(r7, r4, r5)
            if (r4 == 0) goto L2d
            if (r3 != 0) goto L26
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
        L26:
            java.lang.String r4 = r6.value(r2)
            r3.add(r4)
        L2d:
            int r2 = r2 + 1
            goto L11
        L30:
            if (r3 == 0) goto L3b
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            java.lang.String r6 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r1, r6)
        L3b:
            if (r1 != 0) goto L42
            java.util.List r6 = kotlin.collections.f0.J()
            return r6
        L42:
            return r1
    }

    public static final void headersCheckName(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length()
            if (r0 <= 0) goto L51
            int r0 = r4.length()
            r1 = 0
        L10:
            if (r1 >= r0) goto L50
            char r2 = r4.charAt(r1)
            r3 = 33
            if (r3 > r2) goto L21
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L21
            int r1 = r1 + 1
            goto L10
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected char 0x"
            r0.append(r3)
            java.lang.String r2 = charCode(r2)
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in header name: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L50:
            return
        L51:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "name is empty"
            r4.<init>(r0)
            throw r4
    }

    public static final void headersCheckValue(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L76
            char r2 = r4.charAt(r1)
            r3 = 9
            if (r2 == r3) goto L73
            r3 = 32
            if (r3 > r2) goto L22
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L22
            goto L73
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected char 0x"
            r0.append(r3)
            java.lang.String r2 = charCode(r2)
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " value"
            r0.append(r1)
            boolean r5 = okhttp3.internal._UtilCommonKt.isSensitiveHeader(r5)
            if (r5 == 0) goto L51
            java.lang.String r4 = ""
            goto L62
        L51:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = ": "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L62:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L73:
            int r1 = r1 + 1
            goto Lf
        L76:
            return
    }
}
