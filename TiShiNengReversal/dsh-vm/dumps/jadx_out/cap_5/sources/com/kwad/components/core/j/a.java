package com.kwad.components.core.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static int QU = 12;
    private static int QV = 4;
    private static int QW = 1;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.j.a$a, reason: collision with other inner class name */
    public interface InterfaceC0078a {
        void e(@androidx.annotation.Nullable java.util.List<com.kwad.components.core.j.c> r1);

        void onError(int r1, java.lang.String r2);

        void onRequestResult(int r1);
    }

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(int r8, int r9, @androidx.annotation.NonNull com.kwad.sdk.internal.api.SceneImpl r10, int r11, com.kwad.components.core.j.a.InterfaceC0078a r12) {
            com.kwad.sdk.internal.api.SceneImpl r10 = r10.clone()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.setAdStyle(r8)
            r10.setAdNum(r9)
            com.kwad.components.core.request.model.ImpInfo r2 = new com.kwad.components.core.request.model.ImpInfo
            r2.<init>(r10)
            com.kwad.components.core.j.a$1 r6 = new com.kwad.components.core.j.a$1
            r6.<init>(r12, r11, r0)
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            a(r2, r3, r4, r5, r6, r7)
            return
    }

    private static void a(com.kwad.components.core.request.model.ImpInfo r6, java.util.List<java.lang.String> r7, boolean r8, boolean r9, @androidx.annotation.NonNull com.kwad.components.core.request.k r10, boolean r11) {
            com.kwad.components.core.j.a$2 r0 = new com.kwad.components.core.j.a$2
            r4 = 0
            r5 = 1
            r3 = 0
            r2 = r6
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.kwad.components.core.j.a$3 r6 = new com.kwad.components.core.j.a$3
            r7 = 0
            r6.<init>(r7, r10)
            r0.request(r6)
            return
    }

    private static void a(com.kwad.sdk.core.response.model.AdResultData r3, long r4) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.List r2 = r3.getAdTemplateList()
            int r2 = r2.size()
            if (r2 <= 0) goto L23
            java.util.List r3 = r3.getAdTemplateList()
            r2 = 0
            java.lang.Object r3 = r3.get(r2)
            com.kwad.sdk.core.response.model.AdTemplate r3 = (com.kwad.sdk.core.response.model.AdTemplate) r3
            if (r3 == 0) goto L23
            com.kwad.components.core.p.a r2 = com.kwad.components.core.p.a.se()
            long r0 = r0 - r4
            r2.h(r3, r0)
        L23:
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.internal.api.SceneImpl r3, com.kwad.components.core.j.a.InterfaceC0078a r4) {
            int r0 = com.kwad.components.core.j.a.QV
            int r1 = com.kwad.components.core.j.e.AGGREGATION
            r2 = 15
            a(r2, r0, r3, r1, r4)
            return
    }

    private static java.util.List<com.kwad.components.core.j.c> b(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3, int r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r3.next()
            com.kwad.sdk.core.response.model.AdTemplate r1 = (com.kwad.sdk.core.response.model.AdTemplate) r1
            com.kwad.components.core.j.c r2 = new com.kwad.components.core.j.c
            r2.<init>(r1, r4)
            r0.add(r2)
            goto L9
        L1e:
            return r0
    }

    static /* synthetic */ void b(com.kwad.sdk.core.response.model.AdResultData r0, long r1) {
            a(r0, r1)
            return
    }

    public static void b(@androidx.annotation.NonNull com.kwad.sdk.internal.api.SceneImpl r3, com.kwad.components.core.j.a.InterfaceC0078a r4) {
            int r0 = com.kwad.components.core.j.a.QW
            int r1 = com.kwad.components.core.j.e.Rh
            r2 = 17
            a(r2, r0, r3, r1, r4)
            return
    }

    static /* synthetic */ java.util.List c(java.util.List r0, int r1) {
            java.util.List r0 = b(r0, r1)
            return r0
    }
}
