package com.huawei.agconnect.core.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class a extends com.huawei.agconnect.a {
    private static final java.util.List<com.huawei.agconnect.a.InterfaceC0022a> b = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.huawei.agconnect.core.a.a.b = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void c() {
            java.util.List<com.huawei.agconnect.a$a> r0 = com.huawei.agconnect.core.a.a.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.huawei.agconnect.a$a r1 = (com.huawei.agconnect.a.InterfaceC0022a) r1
            r1.onFinish()
            goto L6
        L16:
            return
    }

    @Override // com.huawei.agconnect.a
    public void a(com.huawei.agconnect.a.InterfaceC0022a r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.huawei.agconnect.a$a> r0 = com.huawei.agconnect.core.a.a.b
            r0.add(r2)
        L7:
            return
    }
}
