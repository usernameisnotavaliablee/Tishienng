package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.JvmName(name = "KClassUtil")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class KClassUtil {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <T, C> T findAndInstantiateDatabaseImpl(@org.jetbrains.annotations.NotNull java.lang.Class<C> r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.Package r0 = r10.getPackage()
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L18
        L16:
            java.lang.String r0 = ""
        L18:
            java.lang.String r1 = r10.getCanonicalName()
            kotlin.jvm.internal.g0.m(r1)
            int r2 = r0.length()
            r3 = 1
            if (r2 != 0) goto L28
        L26:
            r4 = r1
            goto L37
        L28:
            int r2 = r0.length()
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            goto L26
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r8 = 4
            r9 = 0
            r5 = 46
            r6 = 95
            r7 = 0
            java.lang.String r2 = kotlin.text.u.w2(r4, r5, r6, r7, r8, r9)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            int r1 = r0.length()     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            if (r1 != 0) goto L59
            r0 = r11
            goto L6d
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            r1.<init>()     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            r1.append(r0)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            r0 = 46
            r1.append(r0)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            r1.append(r11)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
        L6d:
            java.lang.ClassLoader r1 = r10.getClassLoader()     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>"
            kotlin.jvm.internal.g0.n(r0, r1)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            r1 = 0
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            java.lang.Object r10 = r0.newInstance(r1)     // Catch: java.lang.InstantiationException -> L84 java.lang.IllegalAccessException -> L87 java.lang.ClassNotFoundException -> L8a
            return r10
        L84:
            r0 = move-exception
            r11 = r0
            goto L8c
        L87:
            r0 = move-exception
            r11 = r0
            goto La7
        L8a:
            r0 = move-exception
            goto Lc2
        L8c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create an instance of "
            r1.append(r2)
            java.lang.String r10 = r10.getCanonicalName()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10, r11)
            throw r0
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot access the constructor "
            r1.append(r2)
            java.lang.String r10 = r10.getCanonicalName()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10, r11)
            throw r0
        Lc2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find implementation for "
            r2.append(r3)
            java.lang.String r10 = r10.getCanonicalName()
            r2.append(r10)
            java.lang.String r10 = ". "
            r2.append(r10)
            r2.append(r11)
            java.lang.String r10 = " does not exist. Is Room annotation processor correctly configured?"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r1.<init>(r10, r0)
            throw r1
    }

    public static /* synthetic */ java.lang.Object findAndInstantiateDatabaseImpl$default(java.lang.Class r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L6
            java.lang.String r1 = "_Impl"
        L6:
            java.lang.Object r0 = findAndInstantiateDatabaseImpl(r0, r1)
            return r0
    }
}
