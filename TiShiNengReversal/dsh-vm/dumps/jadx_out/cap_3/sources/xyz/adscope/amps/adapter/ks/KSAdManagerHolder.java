package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSAdManagerHolder {
    public KSAdManagerHolder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void sendLossNotification(com.kwad.sdk.api.BaseKSAd r4, xyz.adscope.amps.base.AMPSBidResult r5) {
            if (r4 != 0) goto L4
            goto L8c
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDK sendLossNotification reason:"
            r0.append(r1)
            if (r5 == 0) goto L19
            int r1 = r5.getReason()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L1b
        L19:
            java.lang.String r1 = "null"
        L1b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            r0 = 2
            if (r5 == 0) goto L34
            int r1 = r5.getReason()
            r2 = 1
            if (r1 == r2) goto L32
            goto L34
        L32:
            r1 = 2
            goto L35
        L34:
            r1 = 0
        L35:
            com.kwad.sdk.api.model.AdExposureFailedReason r2 = new com.kwad.sdk.api.model.AdExposureFailedReason
            r2.<init>()
            if (r5 == 0) goto L5b
            int r3 = r5.getEcpm()
            r2.setWinEcpm(r3)
            java.lang.String r3 = r5.getChannelName()
            int r3 = transferAdnType(r3)
            r2.setAdnType(r3)
            if (r0 != r3) goto L5b
            java.lang.String r5 = r5.getChannelName()
            java.lang.String r5 = transferAdnName(r5)
            r2.setAdnName(r5)
        L5b:
            boolean r5 = r4 instanceof com.kwad.sdk.api.KsSplashScreenAd
            if (r5 == 0) goto L65
            com.kwad.sdk.api.KsSplashScreenAd r4 = (com.kwad.sdk.api.KsSplashScreenAd) r4
            r4.reportAdExposureFailed(r1, r2)
            return
        L65:
            boolean r5 = r4 instanceof com.kwad.sdk.api.KsFeedAd
            if (r5 == 0) goto L6f
            com.kwad.sdk.api.KsFeedAd r4 = (com.kwad.sdk.api.KsFeedAd) r4
            r4.reportAdExposureFailed(r1, r2)
            return
        L6f:
            boolean r5 = r4 instanceof com.kwad.sdk.api.KsInterstitialAd
            if (r5 == 0) goto L79
            com.kwad.sdk.api.KsInterstitialAd r4 = (com.kwad.sdk.api.KsInterstitialAd) r4
            r4.reportAdExposureFailed(r1, r2)
            return
        L79:
            boolean r5 = r4 instanceof com.kwad.sdk.api.KsRewardVideoAd
            if (r5 == 0) goto L83
            com.kwad.sdk.api.KsRewardVideoAd r4 = (com.kwad.sdk.api.KsRewardVideoAd) r4
            r4.reportAdExposureFailed(r1, r2)
            return
        L83:
            boolean r5 = r4 instanceof com.kwad.sdk.api.KsDrawAd
            if (r5 == 0) goto L8c
            com.kwad.sdk.api.KsDrawAd r4 = (com.kwad.sdk.api.KsDrawAd) r4
            r4.reportAdExposureFailed(r1, r2)
        L8c:
            return
    }

    public static void sendWinNotification(com.kwad.sdk.api.BaseKSAd r4, int r5) {
            if (r4 != 0) goto L3
            goto L5e
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDK sendWinNotification ecpm:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            boolean r0 = r4 instanceof com.kwad.sdk.api.KsSplashScreenAd
            if (r0 == 0) goto L27
            com.kwad.sdk.api.KsSplashScreenAd r4 = (com.kwad.sdk.api.KsSplashScreenAd) r4
            long r0 = (long) r5
            int r5 = r5 + (-1)
            long r2 = (long) r5
            r4.setBidEcpm(r0, r2)
            return
        L27:
            boolean r0 = r4 instanceof com.kwad.sdk.api.KsFeedAd
            if (r0 == 0) goto L35
            com.kwad.sdk.api.KsFeedAd r4 = (com.kwad.sdk.api.KsFeedAd) r4
            long r0 = (long) r5
            int r5 = r5 + (-1)
            long r2 = (long) r5
            r4.setBidEcpm(r0, r2)
            return
        L35:
            boolean r0 = r4 instanceof com.kwad.sdk.api.KsInterstitialAd
            if (r0 == 0) goto L43
            com.kwad.sdk.api.KsInterstitialAd r4 = (com.kwad.sdk.api.KsInterstitialAd) r4
            long r0 = (long) r5
            int r5 = r5 + (-1)
            long r2 = (long) r5
            r4.setBidEcpm(r0, r2)
            return
        L43:
            boolean r0 = r4 instanceof com.kwad.sdk.api.KsRewardVideoAd
            if (r0 == 0) goto L51
            com.kwad.sdk.api.KsRewardVideoAd r4 = (com.kwad.sdk.api.KsRewardVideoAd) r4
            long r0 = (long) r5
            int r5 = r5 + (-1)
            long r2 = (long) r5
            r4.setBidEcpm(r0, r2)
            return
        L51:
            boolean r0 = r4 instanceof com.kwad.sdk.api.KsDrawAd
            if (r0 == 0) goto L5e
            com.kwad.sdk.api.KsDrawAd r4 = (com.kwad.sdk.api.KsDrawAd) r4
            long r0 = (long) r5
            int r5 = r5 + (-1)
            long r2 = (long) r5
            r4.setBidEcpm(r0, r2)
        L5e:
            return
    }

    private static java.lang.String transferAdnName(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case 1507456: goto L2d;
                case 1507457: goto L22;
                case 1507462: goto L17;
                case 1507487: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L37
        Lc:
            java.lang.String r0 = "1022"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L15
            goto L37
        L15:
            r1 = 3
            goto L37
        L17:
            java.lang.String r0 = "1018"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L37
        L20:
            r1 = 2
            goto L37
        L22:
            java.lang.String r0 = "1013"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L37
        L2b:
            r1 = 1
            goto L37
        L2d:
            java.lang.String r0 = "1012"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            switch(r1) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L40;
                default: goto L3a;
            }
        L3a:
            java.lang.String r2 = "other"
            return r2
        L3d:
            java.lang.String r2 = "baidu"
            return r2
        L40:
            java.lang.String r2 = "chuanshanjia"
            return r2
        L43:
            java.lang.String r2 = "guangdiantong"
            return r2
    }

    private static int transferAdnType(java.lang.String r1) {
            java.lang.String r0 = "1019"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 2
            return r1
    }
}
