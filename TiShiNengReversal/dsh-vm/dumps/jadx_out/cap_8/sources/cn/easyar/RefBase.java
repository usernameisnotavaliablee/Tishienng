package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RefBase implements java.lang.Cloneable {
    protected long cdata_;

    protected RefBase(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>()
            r0.cdata_ = r1
            return
    }

    private static native void _c(java.lang.Class<?> r0, java.util.ArrayList<java.lang.String> r1);

    private native void _dtor();

    private native long _retain();

    private static native void _t(java.lang.Class<?> r0, java.util.ArrayList<java.lang.String> r1);

    private static java.lang.String b(java.lang.Class<?>[] r4, java.lang.Class<?> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r4.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1a
            r3 = r4[r2]
            java.lang.String r3 = c(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto Lc
        L1a:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = c(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static java.lang.String c(java.lang.Class<?> r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L4d
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r3 != r0) goto Ld
            java.lang.String r3 = "V"
            return r3
        Ld:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r3 != r0) goto L14
            java.lang.String r3 = "Z"
            return r3
        L14:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r3 != r0) goto L1b
            java.lang.String r3 = "B"
            return r3
        L1b:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r3 != r0) goto L22
            java.lang.String r3 = "C"
            return r3
        L22:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r3 != r0) goto L29
            java.lang.String r3 = "S"
            return r3
        L29:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 != r0) goto L30
            java.lang.String r3 = "I"
            return r3
        L30:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r3 != r0) goto L37
            java.lang.String r3 = "J"
            return r3
        L37:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r3 != r0) goto L3e
            java.lang.String r3 = "F"
            return r3
        L3e:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 != r0) goto L45
            java.lang.String r3 = "D"
            return r3
        L45:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "PrimitiveNotSupported"
            r3.<init>(r0)
            throw r3
        L4d:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Class r3 = r3.getComponentType()
            java.lang.String r3 = c(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L6d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "L"
            r0.append(r1)
            java.lang.String r3 = r3.getName()
            r1 = 46
            r2 = 47
            java.lang.String r3 = r3.replace(r1, r2)
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static void e(java.lang.Class<?> r14) {
            java.lang.String r0 = r14.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.annotation.Annotation[] r1 = r14.getAnnotations()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L13:
            r5 = 0
            if (r4 >= r2) goto L2a
            r6 = r1[r4]
            java.lang.Class r7 = r6.annotationType()
            java.lang.Class<cn.easyar.TypeId> r8 = cn.easyar.TypeId.class
            if (r7 != r8) goto L27
            cn.easyar.TypeId r6 = (cn.easyar.TypeId) r6
            java.lang.String r1 = r6.value()
            goto L2b
        L27:
            int r4 = r4 + 1
            goto L13
        L2a:
            r1 = r5
        L2b:
            if (r1 == 0) goto L82
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r0)
            r2.add(r1)
            java.lang.reflect.Method[] r0 = r14.getDeclaredMethods()
            int r1 = r0.length
            r4 = 0
        L3e:
            if (r4 >= r1) goto L7e
            r6 = r0[r4]
            java.lang.String r7 = r6.getName()
            java.lang.annotation.Annotation[] r8 = r6.getAnnotations()
            int r9 = r8.length
            r10 = 0
        L4c:
            if (r10 >= r9) goto L62
            r11 = r8[r10]
            java.lang.Class r12 = r11.annotationType()
            java.lang.Class<cn.easyar.MethodId> r13 = cn.easyar.MethodId.class
            if (r12 != r13) goto L5f
            cn.easyar.MethodId r11 = (cn.easyar.MethodId) r11
            java.lang.String r8 = r11.value()
            goto L63
        L5f:
            int r10 = r10 + 1
            goto L4c
        L62:
            r8 = r5
        L63:
            if (r8 != 0) goto L66
            goto L7b
        L66:
            r2.add(r7)
            r2.add(r8)
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r6 = b(r7, r6)
            r2.add(r6)
        L7b:
            int r4 = r4 + 1
            goto L3e
        L7e:
            _c(r14, r2)
            return
        L82:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "MissingTypeId"
            r14.<init>(r0)
            throw r14
    }

    public static void f(java.lang.Class<?> r14) {
            java.lang.String r0 = r14.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.annotation.Annotation[] r1 = r14.getDeclaredAnnotations()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L13:
            r5 = 0
            if (r4 >= r2) goto L2a
            r6 = r1[r4]
            java.lang.Class r7 = r6.annotationType()
            java.lang.Class<cn.easyar.TypeId> r8 = cn.easyar.TypeId.class
            if (r7 != r8) goto L27
            cn.easyar.TypeId r6 = (cn.easyar.TypeId) r6
            java.lang.String r1 = r6.value()
            goto L2b
        L27:
            int r4 = r4 + 1
            goto L13
        L2a:
            r1 = r5
        L2b:
            if (r1 == 0) goto L82
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r0)
            r2.add(r1)
            java.lang.reflect.Method[] r0 = r14.getDeclaredMethods()
            int r1 = r0.length
            r4 = 0
        L3e:
            if (r4 >= r1) goto L7e
            r6 = r0[r4]
            java.lang.String r7 = r6.getName()
            java.lang.annotation.Annotation[] r8 = r6.getDeclaredAnnotations()
            int r9 = r8.length
            r10 = 0
        L4c:
            if (r10 >= r9) goto L62
            r11 = r8[r10]
            java.lang.Class r12 = r11.annotationType()
            java.lang.Class<cn.easyar.MethodId> r13 = cn.easyar.MethodId.class
            if (r12 != r13) goto L5f
            cn.easyar.MethodId r11 = (cn.easyar.MethodId) r11
            java.lang.String r8 = r11.value()
            goto L63
        L5f:
            int r10 = r10 + 1
            goto L4c
        L62:
            r8 = r5
        L63:
            if (r8 != 0) goto L66
            goto L7b
        L66:
            r2.add(r7)
            r2.add(r8)
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r6 = b(r7, r6)
            r2.add(r6)
        L7b:
            int r4 = r4 + 1
            goto L3e
        L7e:
            _t(r14, r2)
            return
        L82:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "MissingTypeId"
            r14.<init>(r0)
            throw r14
    }

    public void a() {
            r0 = this;
            r0._dtor()
            return
    }

    public java.lang.Object clone() {
            r5 = this;
            long r0 = r5.cdata_
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L15
            cn.easyar.RefBase r0 = (cn.easyar.RefBase) r0     // Catch: java.lang.CloneNotSupportedException -> L15
            long r1 = r5._retain()     // Catch: java.lang.CloneNotSupportedException -> L15
            r0.cdata_ = r1     // Catch: java.lang.CloneNotSupportedException -> L15
            return r0
        L15:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ObjectDisposed"
            r0.<init>(r1)
            throw r0
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            r0.a()
            super.finalize()
            return
    }
}
