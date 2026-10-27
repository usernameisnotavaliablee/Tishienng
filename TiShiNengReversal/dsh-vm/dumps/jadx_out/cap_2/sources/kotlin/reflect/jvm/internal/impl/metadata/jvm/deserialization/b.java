package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.lang.String> c = null;

    static {
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.a = r0
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r3 = 108(0x6c, float:1.51E-43)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 105(0x69, float:1.47E-43)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r5 = 110(0x6e, float:1.54E-43)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r6 = 6
            java.lang.Character[] r6 = new java.lang.Character[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r1 = 3
            r6[r1] = r3
            r1 = 4
            r6[r1] = r4
            r1 = 5
            r6[r1] = r5
            java.util.List r1 = kotlin.collections.f0.Q(r6)
            r8 = r1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r15 = 62
            r16 = 0
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r1 = kotlin.collections.f0.r3(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r22 = "Double"
            java.lang.String r23 = "D"
            java.lang.String r8 = "Boolean"
            java.lang.String r9 = "Z"
            java.lang.String r10 = "Char"
            java.lang.String r11 = "C"
            java.lang.String r12 = "Byte"
            java.lang.String r13 = "B"
            java.lang.String r14 = "Short"
            java.lang.String r15 = "S"
            java.lang.String r16 = "Int"
            java.lang.String r17 = "I"
            java.lang.String r18 = "Float"
            java.lang.String r19 = "F"
            java.lang.String r20 = "Long"
            java.lang.String r21 = "J"
            java.lang.String[] r2 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r2 = kotlin.collections.f0.Q(r2)
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            int r3 = r3 + (-1)
            int r0 = kotlin.internal.c.c(r7, r3, r0)
            if (r0 < 0) goto Lf6
            r3 = 0
        L95:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b
            r4.append(r5)
            r6 = 47
            r4.append(r6)
            java.lang.Object r8 = r2.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            int r8 = r3 + 1
            java.lang.Object r9 = r2.get(r8)
            r1.put(r4, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r6)
            java.lang.Object r5 = r2.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r5 = "Array"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 91
            r5.append(r6)
            java.lang.Object r6 = r2.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.put(r4, r5)
            if (r3 == r0) goto Lf6
            int r3 = r3 + 2
            goto L95
        Lf6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b
            r0.append(r2)
            java.lang.String r2 = "/Unit"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "V"
            r1.put(r0, r2)
            java.lang.String r0 = "Any"
            java.lang.String r2 = "java/lang/Object"
            a(r1, r0, r2)
            java.lang.String r0 = "Nothing"
            java.lang.String r2 = "java/lang/Void"
            a(r1, r0, r2)
            java.lang.String r0 = "Annotation"
            java.lang.String r2 = "java/lang/annotation/Annotation"
            a(r1, r0, r2)
            java.lang.String r13 = "Comparable"
            java.lang.String r14 = "Enum"
            java.lang.String r8 = "String"
            java.lang.String r9 = "CharSequence"
            java.lang.String r10 = "Throwable"
            java.lang.String r11 = "Cloneable"
            java.lang.String r12 = "Number"
            java.lang.String[] r0 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14}
            java.util.List r0 = kotlin.collections.f0.Q(r0)
            java.util.Iterator r0 = r0.iterator()
        L13d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L15e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "java/lang/"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            a(r1, r2, r3)
            goto L13d
        L15e:
            java.lang.String r12 = "Map"
            java.lang.String r13 = "ListIterator"
            java.lang.String r8 = "Iterator"
            java.lang.String r9 = "Collection"
            java.lang.String r10 = "List"
            java.lang.String r11 = "Set"
            java.lang.String[] r0 = new java.lang.String[]{r8, r9, r10, r11, r12, r13}
            java.util.List r0 = kotlin.collections.f0.Q(r0)
            java.util.Iterator r0 = r0.iterator()
        L176:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1cb
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "collections/"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "java/util/"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            a(r1, r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "collections/Mutable"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            a(r1, r3, r2)
            goto L176
        L1cb:
            java.lang.String r0 = "collections/Iterable"
            java.lang.String r2 = "java/lang/Iterable"
            a(r1, r0, r2)
            java.lang.String r0 = "collections/MutableIterable"
            a(r1, r0, r2)
            java.lang.String r0 = "collections/Map.Entry"
            java.lang.String r2 = "java/util/Map$Entry"
            a(r1, r0, r2)
            java.lang.String r0 = "collections/MutableMap.MutableEntry"
            a(r1, r0, r2)
        L1e3:
            r0 = 23
            if (r7 >= r0) goto L239
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Function"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b
            r2.append(r3)
            java.lang.String r4 = "/jvm/functions/Function"
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            a(r1, r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "reflect/KFunction"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "/reflect/KFunction"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            a(r1, r0, r2)
            int r7 = r7 + 1
            goto L1e3
        L239:
            java.lang.String r15 = "String"
            java.lang.String r16 = "Enum"
            java.lang.String r8 = "Char"
            java.lang.String r9 = "Byte"
            java.lang.String r10 = "Short"
            java.lang.String r11 = "Int"
            java.lang.String r12 = "Float"
            java.lang.String r13 = "Long"
            java.lang.String r14 = "Double"
            java.lang.String[] r0 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r0 = kotlin.collections.f0.Q(r0)
            java.util.Iterator r0 = r0.iterator()
        L257:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L293
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = ".Companion"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b
            r4.append(r5)
            java.lang.String r5 = "/jvm/internal/"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "CompanionObject"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            a(r1, r3, r2)
            goto L257
        L293:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.c = r1
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void a(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            r0.append(r4)
            r4 = 59
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.put(r3, r4)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.c
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 36
            r5 = 0
            r2 = r8
            java.lang.String r8 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
            r0.append(r8)
            r8 = 59
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
        L32:
            return r0
    }
}
