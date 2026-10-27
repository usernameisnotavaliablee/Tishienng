package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    private final java.util.Map<java.lang.String, java.lang.Float> a;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public static /* synthetic */ int a(java.util.Map.Entry r0, java.util.Map.Entry r1) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.lang.Object r1 = r1.getValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r0 = r0 - r1
            int r0 = (int) r0
            return r0
    }

    public java.util.Set<java.lang.String> b() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.a
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public float c(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
        L15:
            r2 = 0
            return r2
    }

    public java.lang.String d() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r2.a
            java.util.Set r0 = r0.entrySet()
            j0.a r1 = new j0.a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public void e(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r3.a
            boolean r1 = r0.containsKey(r4)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L17
            java.util.Map<java.lang.String, java.lang.Float> r1 = r3.a
            java.lang.Object r1 = r1.get(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r2 = r2 + r1
        L17:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r0.put(r4, r1)
            return
    }

    public void f(java.lang.String r2, float r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.put(r2, r3)
            return
    }
}
