package com.bytedance.adsdk.ugeno.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j {
    protected com.bytedance.adsdk.ugeno.xt.cw ae;
    protected java.util.Map<java.lang.Float, java.lang.String> cw;
    protected android.content.Context j;

    /* renamed from: m, reason: collision with root package name */
    protected java.util.List<android.animation.PropertyValuesHolder> f1970m;

    /* renamed from: r, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.j.up f1971r;
    protected java.util.List<android.animation.Keyframe> up;
    protected java.lang.String xt;

    public j(android.content.Context r1, com.bytedance.adsdk.ugeno.xt.cw r2, java.lang.String r3, java.util.Map<java.lang.Float, java.lang.String> r4) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r3
            r0.cw = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1970m = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.up = r1
            java.lang.String r1 = r0.xt
            com.bytedance.adsdk.ugeno.j.up r1 = com.bytedance.adsdk.ugeno.j.up.j(r1)
            r0.f1971r = r1
            r0.ae = r2
            return
    }

    public void cw() {
            r3 = this;
            java.util.Map<java.lang.Float, java.lang.String> r0 = r3.cw
            if (r0 == 0) goto L2e
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L2e
        Lb:
            java.util.Map<java.lang.Float, java.lang.String> r0 = r3.cw
            boolean r1 = r0 instanceof java.util.TreeMap
            if (r1 == 0) goto L2e
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.lang.Object r0 = r0.lastKey()
            java.lang.Float r0 = (java.lang.Float) r0
            float r1 = r0.floatValue()
            r2 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L2e
            java.util.Map<java.lang.Float, java.lang.String> r1 = r3.cw
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.j(r2, r0)
        L2e:
            return
    }

    public java.lang.String getType() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.up r0 = r1.f1971r
            java.lang.String r0 = r0.cw()
            return r0
    }

    public abstract void j(float r1, java.lang.String r2);

    public boolean j() {
            r2 = this;
            java.util.Map<java.lang.Float, java.lang.String> r0 = r2.cw
            if (r0 == 0) goto L17
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L17
        Lb:
            java.util.Map<java.lang.Float, java.lang.String> r0 = r2.cw
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public abstract android.animation.TypeEvaluator m();

    public void r() {
            r4 = this;
            java.util.Map<java.lang.Float, java.lang.String> r0 = r4.cw
            if (r0 == 0) goto L46
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L46
        Lb:
            boolean r0 = r4.j()
            if (r0 != 0) goto L14
            r4.xt()
        L14:
            java.util.Map<java.lang.Float, java.lang.String> r0 = r4.cw
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L1e
            java.lang.Object r2 = r1.getKey()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4.j(r2, r1)
            goto L1e
        L43:
            r4.cw()
        L46:
            return
    }

    public java.util.List<android.animation.PropertyValuesHolder> up() {
            r3 = this;
            com.bytedance.adsdk.ugeno.j.up r0 = r3.f1971r
            java.lang.String r0 = r0.xt()
            r3.r()
            java.util.List<android.animation.Keyframe> r1 = r3.up
            r2 = 0
            android.animation.Keyframe[] r2 = new android.animation.Keyframe[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            android.animation.Keyframe[] r1 = (android.animation.Keyframe[]) r1
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r0, r1)
            android.animation.TypeEvaluator r1 = r3.m()
            if (r1 == 0) goto L21
            r0.setEvaluator(r1)
        L21:
            java.util.List<android.animation.PropertyValuesHolder> r1 = r3.f1970m
            r1.add(r0)
            java.util.List<android.animation.PropertyValuesHolder> r0 = r3.f1970m
            return r0
    }

    public abstract void xt();
}
