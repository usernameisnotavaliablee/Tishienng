package com.bxkj.base.v2.common.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultipartBodyExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBodyExt.kt\ncom/bxkj/base/v2/common/ext/MultipartBodyExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1869#2,2:50\n*S KotlinDebug\n*F\n+ 1 MultipartBodyExt.kt\ncom/bxkj/base/v2/common/ext/MultipartBodyExtKt\n*L\n11#1:50,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.String>> a(@org.jetbrains.annotations.NotNull okhttp3.MultipartBody r18) {
            java.lang.String r0 = "<this>"
            r1 = r18
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r4 = 0
            java.util.List r0 = r1.parts()     // Catch: java.lang.Exception -> L8c
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> L8c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L8c
        L1c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L8c
            if (r1 == 0) goto L10b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L8c
            okhttp3.MultipartBody$Part r1 = (okhttp3.MultipartBody.Part) r1     // Catch: java.lang.Exception -> L8c
            okhttp3.RequestBody r5 = r1.body()     // Catch: java.lang.Exception -> L8c
            okhttp3.Headers r1 = r1.headers()     // Catch: java.lang.Exception -> L8c
            if (r1 == 0) goto L1c
            java.lang.String r6 = r1.value(r4)     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = " "
            java.lang.String r8 = ""
            r10 = 4
            r11 = 0
            r9 = 0
            java.lang.String r12 = kotlin.text.u.x2(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L8c
            java.lang.String r13 = "\""
            java.lang.String r14 = ""
            r16 = 4
            r17 = 0
            r15 = 0
            java.lang.String r6 = kotlin.text.u.x2(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = ";"
            java.lang.String[] r7 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> L8c
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            java.util.List r1 = kotlin.text.u.m5(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L8c
            int r6 = r1.size()     // Catch: java.lang.Exception -> L8c
            r7 = 2
            java.lang.String r8 = "="
            r9 = 1
            if (r6 == r7) goto Ld2
            r10 = 3
            if (r6 == r10) goto L6a
            goto L1c
        L6a:
            java.lang.Object r6 = r1.get(r9)     // Catch: java.lang.Exception -> L8c
            r10 = r6
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch: java.lang.Exception -> L8c
            java.lang.String[] r11 = new java.lang.String[]{r8}     // Catch: java.lang.Exception -> L8c
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            java.util.List r6 = kotlin.text.u.m5(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L8c
            int r10 = r6.size()     // Catch: java.lang.Exception -> L8c
            java.lang.String r11 = ""
            if (r10 <= r9) goto L8e
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Exception -> L8c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L8c
            goto L8f
        L8c:
            r0 = move-exception
            goto L102
        L8e:
            r6 = r11
        L8f:
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Exception -> L8c
            r12 = r1
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch: java.lang.Exception -> L8c
            java.lang.String[] r13 = new java.lang.String[]{r8}     // Catch: java.lang.Exception -> L8c
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            java.util.List r1 = kotlin.text.u.m5(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L8c
            int r7 = r1.size()     // Catch: java.lang.Exception -> L8c
            if (r7 <= r9) goto Lb1
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Exception -> L8c
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L8c
        Lb1:
            long r7 = r5.contentLength()     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = com.bxkj.base.v2.common.ext.g.a(r7)     // Catch: java.lang.Exception -> L8c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8c
            r5.<init>()     // Catch: java.lang.Exception -> L8c
            r5.append(r11)     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = " "
            r5.append(r7)     // Catch: java.lang.Exception -> L8c
            r5.append(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L8c
            r3.put(r6, r1)     // Catch: java.lang.Exception -> L8c
            goto L1c
        Ld2:
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Exception -> L8c
            r10 = r1
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch: java.lang.Exception -> L8c
            java.lang.String[] r11 = new java.lang.String[]{r8}     // Catch: java.lang.Exception -> L8c
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            java.util.List r1 = kotlin.text.u.m5(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L8c
            int r6 = r1.size()     // Catch: java.lang.Exception -> L8c
            if (r6 <= r9) goto L1c
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8c
            okio.Buffer r6 = new okio.Buffer     // Catch: java.lang.Exception -> L8c
            r6.<init>()     // Catch: java.lang.Exception -> L8c
            r5.writeTo(r6)     // Catch: java.lang.Exception -> L8c
            java.lang.String r5 = r6.readUtf8()     // Catch: java.lang.Exception -> L8c
            r2.put(r1, r5)     // Catch: java.lang.Exception -> L8c
            goto L1c
        L102:
            java.lang.String r0 = com.bxkj.base.v2.common.ext.e.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.orhanobut.logger.j.e(r0, r1)
        L10b:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            return r0
    }
}
