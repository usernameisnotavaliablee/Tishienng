package com.amap.api.services.help;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Inputtips {
    private com.amap.api.services.interfaces.IInputtipsSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface InputtipsListener {
        void onGetInputtips(java.util.List<com.amap.api.services.help.Tip> r1, int r2);
    }

    public Inputtips(android.content.Context r2, com.amap.api.services.help.Inputtips.InputtipsListener r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.s.o0 r0 = new com.amap.api.col.s.o0     // Catch: java.lang.Exception -> Le
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> Le
            r1.a = r0     // Catch: java.lang.Exception -> Le
            return
        Le:
            r2 = move-exception
            boolean r3 = r2 instanceof com.amap.api.services.core.AMapException
            if (r3 != 0) goto L14
            return
        L14:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
    }

    public Inputtips(android.content.Context r2, com.amap.api.services.help.InputtipsQuery r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.s.o0 r0 = new com.amap.api.col.s.o0     // Catch: java.lang.Exception -> Ld
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> Ld
            r1.a = r0     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    public final com.amap.api.services.help.InputtipsQuery getQuery() {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.help.InputtipsQuery r0 = r0.getQuery()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final java.util.List<com.amap.api.services.help.Tip> requestInputtips() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L9
            java.util.ArrayList r0 = r0.requestInputtips()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void requestInputtips(java.lang.String r2, java.lang.String r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.requestInputtips(r2, r3)
        L7:
            return
    }

    public final void requestInputtips(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.requestInputtips(r2, r3, r4)
        L7:
            return
    }

    public final void requestInputtipsAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.requestInputtipsAsyn()
        L7:
            return
    }

    public final void setInputtipsListener(com.amap.api.services.help.Inputtips.InputtipsListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setInputtipsListener(r2)
        L7:
            return
    }

    public final void setQuery(com.amap.api.services.help.InputtipsQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IInputtipsSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}
