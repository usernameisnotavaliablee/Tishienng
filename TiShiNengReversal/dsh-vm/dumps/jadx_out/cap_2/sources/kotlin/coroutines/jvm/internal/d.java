package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,158:1\n37#2,2:159\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:159,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {
    private static final int a = 1;
    private static final int b = 2;

    private static final kotlin.coroutines.jvm.internal.DebugMetadata a(kotlin.coroutines.jvm.internal.BaseContinuationImpl r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<kotlin.coroutines.jvm.internal.DebugMetadata> r0 = kotlin.coroutines.jvm.internal.DebugMetadata.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r1 = (kotlin.coroutines.jvm.internal.DebugMetadata) r1
            return r1
    }

    private static final int b(kotlin.coroutines.jvm.internal.BaseContinuationImpl r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "label"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L24
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L24
            boolean r0 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L19
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L24
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L21
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L24
            goto L22
        L21:
            r2 = 0
        L22:
            int r2 = r2 - r1
            return r2
        L24:
            r2 = -1
            return r2
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.PublishedApi
    public static final int c(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.BaseContinuationImpl r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = a(r4)
            r1 = -1
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r0.v()
            r3 = 2
            if (r2 >= r3) goto L15
            return r1
        L15:
            int r4 = b(r4)
            if (r4 >= 0) goto L1c
            return r1
        L1c:
            int[] r2 = r0.nl()
            int r2 = r2.length
            if (r4 < r2) goto L24
            return r1
        L24:
            int[] r0 = r0.nl()
            r4 = r0[r4]
            return r4
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "getSpilledVariableFieldMapping")
    @org.jetbrains.annotations.Nullable
    @kotlin.PublishedApi
    public static final java.lang.String[] d(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.BaseContinuationImpl r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = a(r7)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r0.v()
            r3 = 1
            if (r2 >= r3) goto L15
            return r1
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r7 = b(r7)
            int[] r2 = r0.i()
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L25:
            if (r5 >= r3) goto L40
            r6 = r2[r5]
            if (r6 != r7) goto L3d
            java.lang.String[] r6 = r0.s()
            r6 = r6[r5]
            r1.add(r6)
            java.lang.String[] r6 = r0.n()
            r6 = r6[r5]
            r1.add(r6)
        L3d:
            int r5 = r5 + 1
            goto L25
        L40:
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r7 = r1.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "getStackTraceElement")
    @org.jetbrains.annotations.Nullable
    @kotlin.PublishedApi
    public static final java.lang.StackTraceElement e(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.BaseContinuationImpl r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = a(r4)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r0.v()
            r3 = 1
            if (r2 >= r3) goto L15
            return r1
        L15:
            int r1 = b(r4)
            if (r1 >= 0) goto L1d
            r1 = -1
            goto L23
        L1d:
            int[] r2 = r0.l()
            r1 = r2[r1]
        L23:
            kotlin.coroutines.jvm.internal.g r2 = kotlin.coroutines.jvm.internal.g.a
            java.lang.String r4 = r2.b(r4)
            if (r4 != 0) goto L30
            java.lang.String r4 = r0.c()
            goto L48
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            java.lang.String r4 = r0.c()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L48:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r2.<init>(r4, r3, r0, r1)
            return r2
    }
}
