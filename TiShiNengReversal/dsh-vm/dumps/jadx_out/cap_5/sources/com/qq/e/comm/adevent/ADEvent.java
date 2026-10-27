package com.qq.e.comm.adevent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ADEvent {
    private final int a;
    private final java.lang.Object[] b;

    public ADEvent(int r2, java.lang.Object... r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r3 = 100
            if (r2 >= r3) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "EventId 错误"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.a(r2)
        L1f:
            return
    }

    private void a(java.lang.String r1) {
            r0 = this;
            com.qq.e.comm.util.GDTLogger.e(r1)
            return
    }

    public <T> T getParam(int r4, java.lang.Class<T> r5) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Object[] r1 = r3.b
            if (r1 == 0) goto L61
            int r2 = r1.length
            if (r2 > r4) goto Lc
            goto L61
        Lc:
            r4 = r1[r4]
            if (r4 != 0) goto L27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ADEvent 参数为空,type:"
            r4.append(r5)
            int r5 = r3.a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.qq.e.comm.util.GDTLogger.e(r4)
            return r0
        L27:
            boolean r1 = r5.isInstance(r4)
            if (r1 != 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ADEvent"
            r1.append(r2)
            int r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = " 参数类型错误,期望类型"
            r1.append(r2)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = "实际类型 "
            r1.append(r5)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.a(r4)
            return r0
        L60:
            return r4
        L61:
            return r0
    }

    public <T> T getParam(java.lang.Class<T> r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.getParam(r0, r2)
            return r2
    }

    public int getType() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
