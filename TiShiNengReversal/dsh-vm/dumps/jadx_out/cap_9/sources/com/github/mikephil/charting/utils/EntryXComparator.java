package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class EntryXComparator implements java.util.Comparator<com.github.mikephil.charting.data.Entry> {
    public EntryXComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(com.github.mikephil.charting.data.Entry r1, com.github.mikephil.charting.data.Entry r2) {
            r0 = this;
            float r1 = r1.getX()
            float r2 = r2.getX()
            float r1 = r1 - r2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L10
            r1 = 0
            return r1
        L10:
            if (r1 <= 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = -1
            return r1
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(com.github.mikephil.charting.data.Entry r1, com.github.mikephil.charting.data.Entry r2) {
            r0 = this;
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            com.github.mikephil.charting.data.Entry r2 = (com.github.mikephil.charting.data.Entry) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }
}
