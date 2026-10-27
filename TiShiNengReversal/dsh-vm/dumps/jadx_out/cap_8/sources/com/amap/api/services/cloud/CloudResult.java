package com.amap.api.services.cloud;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CloudResult {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.cloud.CloudItem> f5119b;

    /* renamed from: c, reason: collision with root package name */
    private int f5120c;

    /* renamed from: d, reason: collision with root package name */
    private int f5121d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.cloud.CloudSearch.Query f5122e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.services.cloud.CloudSearch.SearchBound f5123f;

    private CloudResult(com.amap.api.services.cloud.CloudSearch.Query r1, int r2, com.amap.api.services.cloud.CloudSearch.SearchBound r3, int r4, java.util.ArrayList<com.amap.api.services.cloud.CloudItem> r5) {
            r0 = this;
            r0.<init>()
            r0.f5122e = r1
            r0.f5120c = r2
            r0.f5121d = r4
            int r1 = r0.a(r2)
            r0.a = r1
            r0.f5119b = r5
            r0.f5123f = r3
            return
    }

    private int a(int r2) {
            r1 = this;
            int r0 = r1.f5121d
            int r2 = r2 + r0
            int r2 = r2 + (-1)
            int r2 = r2 / r0
            return r2
    }

    public static com.amap.api.services.cloud.CloudResult createPagedResult(com.amap.api.services.cloud.CloudSearch.Query r6, int r7, com.amap.api.services.cloud.CloudSearch.SearchBound r8, int r9, java.util.ArrayList<com.amap.api.services.cloud.CloudItem> r10) {
            com.amap.api.services.cloud.CloudResult r0 = new com.amap.api.services.cloud.CloudResult
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final com.amap.api.services.cloud.CloudSearch.SearchBound getBound() {
            r1 = this;
            com.amap.api.services.cloud.CloudSearch$SearchBound r0 = r1.f5123f
            return r0
    }

    public final java.util.ArrayList<com.amap.api.services.cloud.CloudItem> getClouds() {
            r1 = this;
            java.util.ArrayList<com.amap.api.services.cloud.CloudItem> r0 = r1.f5119b
            return r0
    }

    public final int getPageCount() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final com.amap.api.services.cloud.CloudSearch.Query getQuery() {
            r1 = this;
            com.amap.api.services.cloud.CloudSearch$Query r0 = r1.f5122e
            return r0
    }

    public final int getTotalCount() {
            r1 = this;
            int r0 = r1.f5120c
            return r0
    }
}
