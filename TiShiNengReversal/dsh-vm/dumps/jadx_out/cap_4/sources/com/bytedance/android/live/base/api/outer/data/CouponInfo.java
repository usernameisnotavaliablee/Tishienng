package com.bytedance.android.live.base.api.outer.data;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CouponInfo {
    long amount;
    boolean applied;
    long threshold;
    long type;

    public CouponInfo(long r1, long r3, long r5, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.threshold = r3
            r0.amount = r5
            r0.applied = r7
            return
    }

    public long getAmount() {
            r2 = this;
            long r0 = r2.amount
            return r0
    }

    public long getThreshold() {
            r2 = this;
            long r0 = r2.threshold
            return r0
    }

    public long getType() {
            r2 = this;
            long r0 = r2.type
            return r0
    }

    public boolean isApplied() {
            r1 = this;
            boolean r0 = r1.applied
            return r0
    }
}
