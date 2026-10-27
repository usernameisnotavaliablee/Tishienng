package com.bytedance.android.live.base.api.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface PushInterceptor {

    public static class InterceptResult {
        public boolean intercept;
        public java.lang.String interceptReason;

        public InterceptResult() {
                r0 = this;
                r0.<init>()
                return
        }

        public InterceptResult(boolean r2) {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r2, r0)
                return
        }

        public InterceptResult(boolean r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.intercept = r1
                java.lang.String r1 = ""
                r0.interceptReason = r1
                return
        }
    }

    com.bytedance.android.live.base.api.push.PushInterceptor.InterceptResult intercept();
}
