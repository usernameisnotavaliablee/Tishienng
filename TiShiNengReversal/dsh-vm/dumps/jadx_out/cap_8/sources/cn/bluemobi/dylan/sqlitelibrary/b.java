package cn.bluemobi.dylan.sqlitelibrary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a(java.lang.Object r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.lang.Class r0 = r7.getClass()
            java.lang.String[] r0 = b(r0)
            java.lang.Class r1 = r7.getClass()
            java.lang.Class[] r1 = c(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L1a:
            int r4 = r0.length
            if (r3 >= r4) goto L42
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "name"
            r6 = r0[r3]
            r4.put(r5, r6)
            java.lang.String r5 = "type"
            r6 = r1[r3]
            r4.put(r5, r6)
            r5 = r0[r3]
            java.lang.Object r5 = e(r7, r5)
            java.lang.String r6 = "value"
            r4.put(r6, r5)
            r2.add(r4)
            int r3 = r3 + 1
            goto L1a
        L42:
            return r2
    }

    public static java.lang.String[] b(java.lang.Class r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            r0 = 0
            java.lang.reflect.Field[] r1 = new java.lang.reflect.Field[r0]
            java.lang.reflect.Field[] r1 = r4.getDeclaredFields()     // Catch: java.lang.SecurityException -> Lb
        Lb:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L10:
            int r2 = r1.length
            if (r0 >= r2) goto L4e
            r2 = r1[r0]
            boolean r2 = r2.isSynthetic()
            if (r2 == 0) goto L1c
            goto L4b
        L1c:
            r2 = r1[r0]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "serialVersionUID"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2b
            goto L4b
        L2b:
            java.lang.Class<android.os.Parcelable$Creator> r2 = android.os.Parcelable.Creator.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.ClassNotFoundException -> L42
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L42
            r3 = r1[r0]     // Catch: java.lang.ClassNotFoundException -> L42
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.ClassNotFoundException -> L42
            boolean r2 = r3.equals(r2)     // Catch: java.lang.ClassNotFoundException -> L42
            if (r2 == 0) goto L42
            goto L4b
        L42:
            r2 = r1[r0]
            java.lang.String r2 = r2.getName()
            r4.add(r2)
        L4b:
            int r0 = r0 + 1
            goto L10
        L4e:
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
    }

    public static java.lang.Class[] c(java.lang.Class r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            r0 = 0
            java.lang.reflect.Field[] r1 = new java.lang.reflect.Field[r0]
            java.lang.reflect.Field[] r1 = r4.getDeclaredFields()     // Catch: java.lang.SecurityException -> Lb
        Lb:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L10:
            int r2 = r1.length
            if (r0 >= r2) goto L4e
            r2 = r1[r0]
            boolean r2 = r2.isSynthetic()
            if (r2 == 0) goto L1c
            goto L4b
        L1c:
            r2 = r1[r0]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "serialVersionUID"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2b
            goto L4b
        L2b:
            java.lang.Class<android.os.Parcelable$Creator> r2 = android.os.Parcelable.Creator.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.ClassNotFoundException -> L42
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L42
            r3 = r1[r0]     // Catch: java.lang.ClassNotFoundException -> L42
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.ClassNotFoundException -> L42
            boolean r2 = r3.equals(r2)     // Catch: java.lang.ClassNotFoundException -> L42
            if (r2 == 0) goto L42
            goto L4b
        L42:
            r2 = r1[r0]
            java.lang.Class r2 = r2.getType()
            r4.add(r2)
        L4b:
            int r0 = r0 + 1
            goto L10
        L4e:
            int r0 = r4.size()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.Class[] r4 = (java.lang.Class[]) r4
            return r4
    }

    public static java.lang.String d(java.lang.Class r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public static java.lang.Object e(java.lang.Object r5, java.lang.String r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            if (r6 == 0) goto L69
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Ld
            goto L69
        Ld:
            r1 = 0
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            r3.<init>()     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.String r4 = "get"
            r3.append(r4)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.String r4 = r6.substring(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.String r4 = r4.toUpperCase()     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            r3.append(r4)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.String r4 = r6.substring(r2)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            r3.append(r4)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.String r3 = r3.toString()     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.reflect.Method r3 = r4.getMethod(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            java.lang.Object r5 = r3.invoke(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L3c java.lang.Throwable -> L69
            return r5
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "is"
            r3.append(r4)
            java.lang.String r1 = r6.substring(r1, r2)
            java.lang.String r1 = r1.toUpperCase()
            r3.append(r1)
            java.lang.String r6 = r6.substring(r2)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            java.lang.reflect.Method r6 = r1.getMethod(r6, r0)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            return r5
        L69:
            return r0
    }
}
