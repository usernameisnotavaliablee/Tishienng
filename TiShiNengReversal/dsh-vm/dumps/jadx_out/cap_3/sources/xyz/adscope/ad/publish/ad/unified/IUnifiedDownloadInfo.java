package xyz.adscope.ad.publish.ad.unified;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IUnifiedDownloadInfo {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IPermissionInfo {
        java.lang.String getDescribe();

        java.lang.String getPermissionType();

        java.lang.String getTitle();
    }

    java.lang.String getApkMD5();

    java.lang.String getAppIntroduction();

    java.lang.String getDeveloper();

    java.lang.String getIconUrl();

    java.lang.String getName();

    java.lang.String getPackageName();

    java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo> getPermission();

    java.lang.String getPermissionUrl();

    java.lang.String getPolicy();

    java.lang.String getPolicyUrl();

    java.lang.String getSize();

    java.lang.String getVersion();
}
