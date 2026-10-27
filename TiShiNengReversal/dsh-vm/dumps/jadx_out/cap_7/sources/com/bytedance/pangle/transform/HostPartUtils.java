package com.bytedance.pangle.transform;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class HostPartUtils {
    private java.lang.Class fragmentActivityClazz;

    private static class SingletonHolder {
        private static final com.bytedance.pangle.transform.HostPartUtils INSTANCE = null;

        static {
                com.bytedance.pangle.transform.HostPartUtils r0 = new com.bytedance.pangle.transform.HostPartUtils
                r0.<init>()
                com.bytedance.pangle.transform.HostPartUtils.SingletonHolder.INSTANCE = r0
                return
        }

        private SingletonHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.bytedance.pangle.transform.HostPartUtils access$000() {
                com.bytedance.pangle.transform.HostPartUtils r0 = com.bytedance.pangle.transform.HostPartUtils.SingletonHolder.INSTANCE
                return r0
        }
    }

    public HostPartUtils() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            r1.fragmentActivityClazz = r0     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public static androidx.fragment.app.FragmentActivity getFragmentActivity(java.lang.Object r0, java.lang.String r1) {
            android.app.Activity r0 = com.bytedance.pangle.transform.ZeusTransformUtils._getActivity(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            return r0
    }

    public static final java.lang.Class getFragmentActivityClass() {
            com.bytedance.pangle.transform.HostPartUtils r0 = com.bytedance.pangle.transform.HostPartUtils.SingletonHolder.access$000()
            java.lang.Class r0 = r0.fragmentActivityClazz
            return r0
    }
}
