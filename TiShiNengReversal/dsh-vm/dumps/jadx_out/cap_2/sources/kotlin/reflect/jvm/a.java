package kotlin.reflect.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KCallablesJvm")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.c<?> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof kotlin.reflect.j
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3c
            r0 = r5
            kotlin.reflect.n r0 = (kotlin.reflect.n) r0
            java.lang.reflect.Field r3 = kotlin.reflect.jvm.d.e(r0)
            if (r3 == 0) goto L19
            boolean r3 = r3.isAccessible()
            goto L1a
        L19:
            r3 = 1
        L1a:
            if (r3 == 0) goto L3b
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.d.f(r0)
            if (r0 == 0) goto L27
            boolean r0 = r0.isAccessible()
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L3b
            kotlin.reflect.j r5 = (kotlin.reflect.j) r5
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.d.h(r5)
            if (r5 == 0) goto L37
            boolean r5 = r5.isAccessible()
            goto L38
        L37:
            r5 = 1
        L38:
            if (r5 == 0) goto L3b
            return r2
        L3b:
            return r1
        L3c:
            boolean r0 = r5 instanceof kotlin.reflect.n
            if (r0 == 0) goto L60
            kotlin.reflect.n r5 = (kotlin.reflect.n) r5
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.d.e(r5)
            if (r0 == 0) goto L4d
            boolean r0 = r0.isAccessible()
            goto L4e
        L4d:
            r0 = 1
        L4e:
            if (r0 == 0) goto L5f
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.d.f(r5)
            if (r5 == 0) goto L5b
            boolean r5 = r5.isAccessible()
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L5f
            return r2
        L5f:
            return r1
        L60:
            boolean r0 = r5 instanceof kotlin.reflect.n.c
            if (r0 == 0) goto L8b
            r0 = r5
            kotlin.reflect.n$c r0 = (kotlin.reflect.n.c) r0
            kotlin.reflect.n r0 = r0.c()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.d.e(r0)
            if (r0 == 0) goto L76
            boolean r0 = r0.isAccessible()
            goto L77
        L76:
            r0 = 1
        L77:
            if (r0 == 0) goto L8a
            kotlin.reflect.i r5 = (kotlin.reflect.i) r5
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.d.g(r5)
            if (r5 == 0) goto L86
            boolean r5 = r5.isAccessible()
            goto L87
        L86:
            r5 = 1
        L87:
            if (r5 == 0) goto L8a
            return r2
        L8a:
            return r1
        L8b:
            boolean r0 = r5 instanceof kotlin.reflect.j.a
            if (r0 == 0) goto Lb6
            r0 = r5
            kotlin.reflect.j$a r0 = (kotlin.reflect.j.a) r0
            kotlin.reflect.n r0 = r0.c()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.d.e(r0)
            if (r0 == 0) goto La1
            boolean r0 = r0.isAccessible()
            goto La2
        La1:
            r0 = 1
        La2:
            if (r0 == 0) goto Lb5
            kotlin.reflect.i r5 = (kotlin.reflect.i) r5
            java.lang.reflect.Method r5 = kotlin.reflect.jvm.d.g(r5)
            if (r5 == 0) goto Lb1
            boolean r5 = r5.isAccessible()
            goto Lb2
        Lb1:
            r5 = 1
        Lb2:
            if (r5 == 0) goto Lb5
            return r2
        Lb5:
            return r1
        Lb6:
            boolean r0 = r5 instanceof kotlin.reflect.i
            if (r0 == 0) goto Lff
            r0 = r5
            kotlin.reflect.i r0 = (kotlin.reflect.i) r0
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.d.g(r0)
            if (r3 == 0) goto Lc8
            boolean r3 = r3.isAccessible()
            goto Lc9
        Lc8:
            r3 = 1
        Lc9:
            if (r3 == 0) goto Lfe
            kotlin.reflect.jvm.internal.e0 r5 = kotlin.reflect.jvm.internal.p3.b(r5)
            r3 = 0
            if (r5 == 0) goto Ldd
            kotlin.reflect.jvm.internal.calls.g r5 = r5.Y()
            if (r5 == 0) goto Ldd
            java.lang.reflect.Member r5 = r5.c()
            goto Lde
        Ldd:
            r5 = r3
        Lde:
            boolean r4 = r5 instanceof java.lang.reflect.AccessibleObject
            if (r4 == 0) goto Le5
            r3 = r5
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
        Le5:
            if (r3 == 0) goto Lec
            boolean r5 = r3.isAccessible()
            goto Led
        Lec:
            r5 = 1
        Led:
            if (r5 == 0) goto Lfe
            java.lang.reflect.Constructor r5 = kotlin.reflect.jvm.d.c(r0)
            if (r5 == 0) goto Lfa
            boolean r5 = r5.isAccessible()
            goto Lfb
        Lfa:
            r5 = 1
        Lfb:
            if (r5 == 0) goto Lfe
            return r2
        Lfe:
            return r1
        Lff:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown callable: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " ("
            r1.append(r2)
            java.lang.Class r5 = r5.getClass()
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public static final void b(@org.jetbrains.annotations.NotNull kotlin.reflect.c<?> r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.reflect.j
            if (r0 == 0) goto L2a
            r0 = r3
            kotlin.reflect.n r0 = (kotlin.reflect.n) r0
            java.lang.reflect.Field r1 = kotlin.reflect.jvm.d.e(r0)
            if (r1 == 0) goto L15
            r1.setAccessible(r4)
        L15:
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.d.f(r0)
            if (r0 == 0) goto L1e
            r0.setAccessible(r4)
        L1e:
            kotlin.reflect.j r3 = (kotlin.reflect.j) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.d.h(r3)
            if (r3 == 0) goto Lbc
            r3.setAccessible(r4)
            return
        L2a:
            boolean r0 = r3 instanceof kotlin.reflect.n
            if (r0 == 0) goto L43
            kotlin.reflect.n r3 = (kotlin.reflect.n) r3
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.d.e(r3)
            if (r0 == 0) goto L39
            r0.setAccessible(r4)
        L39:
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.d.f(r3)
            if (r3 == 0) goto Lbc
            r3.setAccessible(r4)
            return
        L43:
            boolean r0 = r3 instanceof kotlin.reflect.n.c
            if (r0 == 0) goto L63
            r0 = r3
            kotlin.reflect.n$c r0 = (kotlin.reflect.n.c) r0
            kotlin.reflect.n r0 = r0.c()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.d.e(r0)
            if (r0 == 0) goto L57
            r0.setAccessible(r4)
        L57:
            kotlin.reflect.i r3 = (kotlin.reflect.i) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.d.g(r3)
            if (r3 == 0) goto Lbc
            r3.setAccessible(r4)
            return
        L63:
            boolean r0 = r3 instanceof kotlin.reflect.j.a
            if (r0 == 0) goto L83
            r0 = r3
            kotlin.reflect.j$a r0 = (kotlin.reflect.j.a) r0
            kotlin.reflect.n r0 = r0.c()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.d.e(r0)
            if (r0 == 0) goto L77
            r0.setAccessible(r4)
        L77:
            kotlin.reflect.i r3 = (kotlin.reflect.i) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.d.g(r3)
            if (r3 == 0) goto Lbc
            r3.setAccessible(r4)
            return
        L83:
            boolean r0 = r3 instanceof kotlin.reflect.i
            if (r0 == 0) goto Lbd
            r0 = r3
            kotlin.reflect.i r0 = (kotlin.reflect.i) r0
            java.lang.reflect.Method r1 = kotlin.reflect.jvm.d.g(r0)
            if (r1 == 0) goto L93
            r1.setAccessible(r4)
        L93:
            kotlin.reflect.jvm.internal.e0 r3 = kotlin.reflect.jvm.internal.p3.b(r3)
            r1 = 0
            if (r3 == 0) goto La5
            kotlin.reflect.jvm.internal.calls.g r3 = r3.Y()
            if (r3 == 0) goto La5
            java.lang.reflect.Member r3 = r3.c()
            goto La6
        La5:
            r3 = r1
        La6:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 == 0) goto Lad
            r1 = r3
            java.lang.reflect.AccessibleObject r1 = (java.lang.reflect.AccessibleObject) r1
        Lad:
            if (r1 == 0) goto Lb3
            r3 = 1
            r1.setAccessible(r3)
        Lb3:
            java.lang.reflect.Constructor r3 = kotlin.reflect.jvm.d.c(r0)
            if (r3 == 0) goto Lbc
            r3.setAccessible(r4)
        Lbc:
            return
        Lbd:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown callable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
