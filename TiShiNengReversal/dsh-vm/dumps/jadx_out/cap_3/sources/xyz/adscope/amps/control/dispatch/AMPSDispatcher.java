package xyz.adscope.amps.control.dispatch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSDispatcher implements xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface {
    private boolean isDispatchWFSort;
    private boolean isFirstDispatch;
    private int mAdRequestType;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mC2SAdSourceList;
    private int mC2SMaxRequestNum;
    private int mCurrentHighestPrice;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mS2SAdSourceList;
    private java.util.LinkedList<xyz.adscope.amps.model.config.response.AdSourceModel> mSamePriceAdSourceData;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mWFAdSourceList;
    private int mWFMaxRequestNum;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mWFSortAdSourceList;
    private int mWeightRandomNum;


    public AMPSDispatcher(xyz.adscope.amps.model.config.response.SpaceModel r9) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.mC2SMaxRequestNum = r0
            r8.mWFMaxRequestNum = r0
            r8.mAdRequestType = r0
            r8.mWeightRandomNum = r0
            r1 = 0
            r8.mS2SAdSourceList = r1
            r8.mC2SAdSourceList = r1
            r8.mWFAdSourceList = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mWFSortAdSourceList = r1
            r1 = 1
            r8.isFirstDispatch = r1
            r8.isDispatchWFSort = r0
            if (r9 != 0) goto L23
            goto Lfe
        L23:
            int r2 = r9.getBidParallelNum()
            r8.mC2SMaxRequestNum = r2
            int r2 = r9.getWaterfallParallelNum()
            r8.mWFMaxRequestNum = r2
            int r2 = r9.getBidDistributionMethod()
            r8.mAdRequestType = r2
            int r2 = r9.getWeightRandomNum()
            r8.mWeightRandomNum = r2
            java.util.List r2 = r9.getS2sAdSourceList()
            java.util.List r3 = r9.getC2sAdSourceList()
            java.util.List r9 = r9.getWfAdSourceList()
            if (r2 == 0) goto L73
            int r4 = r2.size()
            if (r4 <= 0) goto L73
            r8.mS2SAdSourceList = r2
            java.util.Iterator r2 = r2.iterator()
        L55:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r2.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = (xyz.adscope.amps.model.config.response.AdSourceModel) r4
            int r5 = r4.getStartWeight()
            int r6 = r4.getEndWeight()
            int r7 = r8.mWeightRandomNum
            boolean r5 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r5, r6, r7)
            r4.setHitWeight(r5)
            goto L55
        L73:
            if (r3 == 0) goto L9f
            int r2 = r3.size()
            if (r2 <= 0) goto L9f
            r8.mC2SAdSourceList = r3
            java.util.Iterator r2 = r3.iterator()
        L81:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r2.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3
            int r4 = r3.getStartWeight()
            int r5 = r3.getEndWeight()
            int r6 = r8.mWeightRandomNum
            boolean r4 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r4, r5, r6)
            r3.setHitWeight(r4)
            goto L81
        L9f:
            if (r9 == 0) goto Lfe
            int r2 = r9.size()
            if (r2 <= 0) goto Lfe
            r8.mWFAdSourceList = r9
            java.util.Iterator r9 = r9.iterator()
        Lad:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ld2
            java.lang.Object r2 = r9.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            int r3 = r2.getEcpm()
            r2.setReportEcpm(r3)
            int r3 = r2.getStartWeight()
            int r4 = r2.getEndWeight()
            int r5 = r8.mWeightRandomNum
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r3, r4, r5)
            r2.setHitWeight(r3)
            goto Lad
        Ld2:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r9 = r8.mWFAdSourceList
            r8.sortAdSourceListByEcpm(r9)
            int r9 = r8.mAdRequestType
            if (r9 != r1) goto Le2
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r9 = r8.mWFSortAdSourceList
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r8.mWFAdSourceList
            r9.addAll(r1)
        Le2:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r9 = r8.mWFAdSourceList
            java.lang.Object r9 = r9.get(r0)
            xyz.adscope.amps.model.config.response.AdSourceModel r9 = (xyz.adscope.amps.model.config.response.AdSourceModel) r9
            int r9 = r9.getEcpm()
            r8.mCurrentHighestPrice = r9
            int r9 = r8.mAdRequestType
            r0 = 2
            if (r9 != r0) goto Lfe
            java.util.LinkedList r9 = new java.util.LinkedList
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r8.mWFAdSourceList
            r9.<init>(r0)
            r8.mSamePriceAdSourceData = r9
        Lfe:
            return
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> dispatchAd(xyz.adscope.amps.model.config.response.AdSourceModel r8) {
            r7 = this;
            boolean r0 = r7.isFirstDispatch
            r1 = 0
            if (r0 != 0) goto L8
            if (r8 != 0) goto L8
            return r1
        L8:
            r0 = 0
            r7.isFirstDispatch = r0
            int r2 = r7.mAdRequestType
            r3 = 2
            r4 = 6
            java.lang.String r5 = "WF"
            r6 = 1
            if (r2 != r3) goto L87
            if (r8 != 0) goto L40
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r0 = r7.getWaitDispatchC2SOrS2SAdSourceList()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            java.util.List r0 = r7.getWaitSamePriceAdSourceList()
            if (r0 == 0) goto L3c
            java.util.Iterator r1 = r0.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            r2.setAdStatus(r6)
            goto L2c
        L3c:
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            return r8
        L40:
            java.lang.String r2 = r8.getBiddingType()
            boolean r2 = r7.isC2SOrS2SAdSource(r2)
            if (r2 == 0) goto L57
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r7.getOneWaitDispatchC2SOrS2SAdSource()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            return r8
        L57:
            java.lang.String r2 = r8.getBiddingType()
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L86
            int r2 = r8.getAdStatus()
            if (r2 != r4) goto L86
            boolean r2 = r7.isExistHasSuccessResultWF()
            if (r2 != 0) goto L86
            boolean r8 = r7.judgeIsContinueDispatchSamePriceAdSource(r8)
            if (r8 == 0) goto L86
            java.util.List r8 = r7.getWaitSamePriceAdSourceList()
            if (r8 == 0) goto L86
            java.lang.Object r0 = r8.get(r0)
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0
            boolean r0 = r7.isHigherThanHasSuccessResultC2SOrS2S(r0)
            if (r0 == 0) goto L86
            return r8
        L86:
            return r1
        L87:
            if (r8 != 0) goto Lab
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r0 = r7.getWaitDispatchC2SOrS2SAdSourceList()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            int r0 = r7.mAdRequestType
            if (r0 == 0) goto La3
            if (r0 != r6) goto La2
            boolean r0 = r7.isExistC2SOrS2SAdSource()
            if (r0 != 0) goto La2
            goto La3
        La2:
            return r8
        La3:
            java.util.List r0 = r7.getWaitDispatchWFAdSourceList()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            return r8
        Lab:
            if (r2 != 0) goto Lee
            java.lang.String r0 = r8.getBiddingType()
            boolean r0 = r7.isC2SOrS2SAdSource(r0)
            if (r0 == 0) goto Lc4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r7.getOneWaitDispatchC2SOrS2SAdSource()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            return r8
        Lc4:
            java.lang.String r0 = r8.getBiddingType()
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto Led
            int r8 = r8.getAdStatus()
            if (r8 != r4) goto Led
            boolean r8 = r7.isExistHasSuccessResultWF()
            if (r8 != 0) goto Led
            xyz.adscope.amps.model.config.response.AdSourceModel r8 = r7.getOneWaitDispatchWFAdSource()
            boolean r0 = r7.isHigherThanHasSuccessResultC2SOrS2S(r8)
            if (r0 == 0) goto Led
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            return r0
        Led:
            return r1
        Lee:
            if (r2 != r6) goto L146
            int r0 = r8.getAdStatus()
            r2 = 3
            if (r0 != r2) goto L101
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.mWFSortAdSourceList
            r0.add(r8)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.mWFSortAdSourceList
            r7.sortAdSourceListByEcpm(r0)
        L101:
            int r0 = r8.getAdStatus()
            r2 = 5
            if (r0 != r2) goto L109
            return r1
        L109:
            boolean r0 = r7.isBidFinish()
            if (r0 != 0) goto L127
            java.lang.String r8 = r8.getBiddingType()
            boolean r8 = r7.isC2SOrS2SAdSource(r8)
            if (r8 == 0) goto L126
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r7.getOneWaitDispatchC2SOrS2SAdSource()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            return r8
        L126:
            return r1
        L127:
            boolean r8 = r7.isDispatchWFSort
            if (r8 == 0) goto L13f
            boolean r8 = r7.judgeIsHasLoadingSuccessAdResource()
            if (r8 == 0) goto L132
            return r1
        L132:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r7.getOneWaitDispatchWFSortAdSource()
            xyz.adscope.amps.tool.AMPSListUtil.addDataToList(r8, r0)
            return r8
        L13f:
            r7.isDispatchWFSort = r6
            java.util.List r8 = r7.getWaitDispatchWFSortAdSourceList()
            return r8
        L146:
            return r1
    }

    private xyz.adscope.amps.model.config.response.AdSourceModel getOneWaitDispatchC2SOrS2SAdSource() {
            r5 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.mC2SAdSourceList
            r1 = 1
            if (r0 == 0) goto L36
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.mC2SAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 != 0) goto L20
            goto L11
        L20:
            java.lang.String r3 = "C2S"
            java.lang.String r4 = r2.getBiddingType()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L11
            int r3 = r2.getAdStatus()
            if (r3 != 0) goto L11
            r2.setAdStatus(r1)
            return r2
        L36:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.mS2SAdSourceList
            if (r0 == 0) goto L6b
            int r0 = r0.size()
            if (r0 <= 0) goto L6b
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.mS2SAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 != 0) goto L55
            goto L46
        L55:
            java.lang.String r3 = "S2S"
            java.lang.String r4 = r2.getBiddingType()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L46
            int r3 = r2.getAdStatus()
            if (r3 != 0) goto L46
            r2.setAdStatus(r1)
            return r2
        L6b:
            r0 = 0
            return r0
    }

    private xyz.adscope.amps.model.config.response.AdSourceModel getOneWaitDispatchWFAdSource() {
            r4 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFAdSourceList
            if (r0 == 0) goto L36
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1
            if (r1 != 0) goto L1f
            goto L10
        L1f:
            java.lang.String r2 = "WF"
            java.lang.String r3 = r1.getBiddingType()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L10
            int r2 = r1.getAdStatus()
            if (r2 != 0) goto L10
            r0 = 1
            r1.setAdStatus(r0)
            return r1
        L36:
            r0 = 0
            return r0
    }

    private xyz.adscope.amps.model.config.response.AdSourceModel getOneWaitDispatchWFSortAdSource() {
            r4 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFSortAdSourceList
            if (r0 == 0) goto L31
            int r0 = r0.size()
            if (r0 <= 0) goto L31
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFSortAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1
            if (r1 != 0) goto L1f
            goto L10
        L1f:
            int r2 = r1.getAdStatus()
            if (r2 == 0) goto L2c
            int r2 = r1.getAdStatus()
            r3 = 3
            if (r2 != r3) goto L10
        L2c:
            r0 = 4
            r1.setAdStatus(r0)
            return r1
        L31:
            r0 = 0
            return r0
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getWaitDispatchC2SOrS2SAdSourceList() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mC2SAdSourceList
            r2 = 1
            if (r1 == 0) goto L47
            int r1 = r1.size()
            if (r1 <= 0) goto L47
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mC2SAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3
            if (r3 != 0) goto L25
            goto L16
        L25:
            int r4 = r0.size()
            int r5 = r6.mC2SMaxRequestNum
            if (r4 < r5) goto L2e
            goto L47
        L2e:
            java.lang.String r4 = "C2S"
            java.lang.String r5 = r3.getBiddingType()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L16
            int r4 = r3.getAdStatus()
            if (r4 != 0) goto L16
            r3.setAdStatus(r2)
            r0.add(r3)
            goto L16
        L47:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mS2SAdSourceList
            if (r1 == 0) goto L88
            int r1 = r1.size()
            if (r1 <= 0) goto L88
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mS2SAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3
            if (r3 != 0) goto L66
            goto L57
        L66:
            int r4 = r0.size()
            int r5 = r6.mC2SMaxRequestNum
            if (r4 < r5) goto L6f
            goto L88
        L6f:
            java.lang.String r4 = "S2S"
            java.lang.String r5 = r3.getBiddingType()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L57
            int r4 = r3.getAdStatus()
            if (r4 != 0) goto L57
            r3.setAdStatus(r2)
            r0.add(r3)
            goto L57
        L88:
            return r0
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getWaitDispatchWFAdSourceList() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r5.mWFAdSourceList
            if (r1 == 0) goto L47
            int r1 = r1.size()
            if (r1 <= 0) goto L47
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r5.mWFAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 != 0) goto L24
            goto L15
        L24:
            int r3 = r0.size()
            int r4 = r5.mWFMaxRequestNum
            if (r3 < r4) goto L2d
            goto L47
        L2d:
            java.lang.String r3 = "WF"
            java.lang.String r4 = r2.getBiddingType()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L15
            int r3 = r2.getAdStatus()
            if (r3 != 0) goto L15
            r3 = 1
            r2.setAdStatus(r3)
            r0.add(r2)
            goto L15
        L47:
            return r0
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getWaitDispatchWFSortAdSourceList() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r5.mWFSortAdSourceList
            if (r1 == 0) goto L42
            int r1 = r1.size()
            if (r1 <= 0) goto L42
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r5.mWFSortAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 != 0) goto L24
            goto L15
        L24:
            int r3 = r0.size()
            int r4 = r5.mWFMaxRequestNum
            if (r3 < r4) goto L2d
            goto L42
        L2d:
            int r3 = r2.getAdStatus()
            if (r3 == 0) goto L3a
            int r3 = r2.getAdStatus()
            r4 = 3
            if (r3 != r4) goto L15
        L3a:
            r3 = 4
            r2.setAdStatus(r3)
            r0.add(r2)
            goto L15
        L42:
            return r0
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getWaitSamePriceAdSourceList() {
            r4 = this;
            java.util.LinkedList<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mSamePriceAdSourceData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.poll()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r2 = r0.getEcpm()     // Catch: java.lang.Exception -> L4a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            r3.add(r0)     // Catch: java.lang.Exception -> L47
        L1b:
            java.util.LinkedList<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mSamePriceAdSourceData     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L49
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L47
            if (r0 != 0) goto L49
            java.util.LinkedList<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mSamePriceAdSourceData     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L49
            java.util.LinkedList<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mSamePriceAdSourceData     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Exception -> L47
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0     // Catch: java.lang.Exception -> L47
            int r0 = r0.getEcpm()     // Catch: java.lang.Exception -> L47
            if (r0 != r2) goto L49
            java.util.LinkedList<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mSamePriceAdSourceData     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Exception -> L47
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0     // Catch: java.lang.Exception -> L47
            r3.add(r0)     // Catch: java.lang.Exception -> L47
            goto L1b
        L47:
            r1 = r3
            goto L4a
        L49:
            return r3
        L4a:
            return r1
    }

    private void handleBiddingRaisePrice(xyz.adscope.amps.model.config.response.AdSourceModel r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L4b
        L3:
            java.lang.String r0 = r4.getBiddingType()
            boolean r0 = r3.isC2SOrS2SAdSource(r0)
            if (r0 != 0) goto Le
            goto L4b
        Le:
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r4.getAuctionStrategy()
            if (r0 != 0) goto L15
            goto L4b
        L15:
            boolean r1 = r0.isRaise()
            if (r1 == 0) goto L1c
            goto L4b
        L1c:
            int r1 = r0.getEffectRate()
            boolean r1 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r1)
            if (r1 != 0) goto L27
            goto L4b
        L27:
            r1 = 1
            r0.setHit(r1)
            r0.setRaise(r1)
            int r1 = r0.getRaiseSortPrice()
            int r2 = r4.getEcpm()
            int r2 = r2 + r1
            r4.setEcpm(r2)
            r0.setOriginEcpm(r2)
            int r4 = r0.getSecondPrice()
            if (r4 <= 0) goto L4b
            int r4 = r0.getSecondPrice()
            int r4 = r4 + r1
            r0.setSecondPrice(r4)
        L4b:
            return
    }

    private void handleWFRaisePrice(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r6) {
            r5 = this;
            if (r6 == 0) goto L78
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto La
            goto L78
        La:
            java.util.Iterator r6 = r6.iterator()
        Le:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r6.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0
            if (r0 != 0) goto L1d
            goto Le
        L1d:
            java.lang.String r1 = r0.getBiddingType()
            boolean r1 = r5.isC2SOrS2SAdSource(r1)
            r2 = 1
            if (r1 == 0) goto L30
            int r1 = r5.mAdRequestType
            if (r1 != r2) goto L30
            r5.handleBiddingRaisePrice(r0)
            goto Le
        L30:
            java.lang.String r1 = "WF"
            java.lang.String r3 = r0.getBiddingType()
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L3d
            goto Le
        L3d:
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r1 = r0.getAuctionStrategy()
            if (r1 != 0) goto L44
            goto Le
        L44:
            boolean r3 = r1.isRaise()
            if (r3 == 0) goto L4b
            goto Le
        L4b:
            int r3 = r0.getEcpm()
            r1.setOriginEcpm(r3)
            int r4 = r1.getEffectRate()
            boolean r4 = xyz.adscope.amps.tool.util.AMPSRandomUtil.isHitRandomNum(r4)
            if (r4 != 0) goto L5d
            goto Le
        L5d:
            r1.setHit(r2)
            r1.setRaise(r2)
            int r2 = r1.getRaiseSortPrice()
            int r1 = r1.getOriginEcpm()
            int r3 = r3 + r2
            int r2 = r5.mCurrentHighestPrice
            if (r3 < r2) goto L74
            if (r1 >= r2) goto L74
            int r3 = r2 + (-1)
        L74:
            r0.setEcpm(r3)
            goto Le
        L78:
            return
    }

    private boolean isBidFinish() {
            r7 = this;
            boolean r0 = r7.isExistC2SOrS2SAdSource()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.mC2SAdSourceList
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L3c
            int r0 = r0.size()
            if (r0 <= 0) goto L3c
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.mC2SAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = (xyz.adscope.amps.model.config.response.AdSourceModel) r4
            if (r4 != 0) goto L29
            goto L1a
        L29:
            java.lang.String r5 = "C2S"
            java.lang.String r6 = r4.getBiddingType()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L1a
            int r4 = r4.getAdStatus()
            if (r4 > r3) goto L1a
            return r2
        L3c:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.mS2SAdSourceList
            if (r0 == 0) goto L6e
            int r0 = r0.size()
            if (r0 <= 0) goto L6e
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.mS2SAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = (xyz.adscope.amps.model.config.response.AdSourceModel) r4
            if (r4 != 0) goto L5b
            goto L4c
        L5b:
            java.lang.String r5 = "S2S"
            java.lang.String r6 = r4.getBiddingType()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L4c
            int r4 = r4.getAdStatus()
            if (r4 > r3) goto L4c
            return r2
        L6e:
            return r1
    }

    private boolean isC2SOrS2SAdSource(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "C2S"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "S2S"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private boolean isExistC2SOrS2SAdSource() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r1.mC2SAdSourceList
            if (r0 == 0) goto La
            int r0 = r0.size()
            if (r0 != 0) goto L15
        La:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r1.mS2SAdSourceList
            if (r0 == 0) goto L17
            int r0 = r0.size()
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    private boolean isExistHasSuccessResultWF() {
            r4 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFAdSourceList
            if (r0 == 0) goto L34
            int r0 = r0.size()
            if (r0 <= 0) goto L34
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1
            if (r1 != 0) goto L1f
            goto L10
        L1f:
            java.lang.String r2 = "WF"
            java.lang.String r3 = r1.getBiddingType()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L10
            int r1 = r1.getAdStatus()
            r2 = 5
            if (r1 != r2) goto L10
            r0 = 1
            return r0
        L34:
            r0 = 0
            return r0
    }

    private boolean isHigherThanHasSuccessResultC2SOrS2S(xyz.adscope.amps.model.config.response.AdSourceModel r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mC2SAdSourceList
            r2 = 5
            if (r1 == 0) goto L41
            int r1 = r1.size()
            if (r1 <= 0) goto L41
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mC2SAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3
            if (r3 != 0) goto L24
            goto L15
        L24:
            java.lang.String r4 = "C2S"
            java.lang.String r5 = r3.getBiddingType()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L15
            int r4 = r3.getAdStatus()
            if (r4 != r2) goto L15
            int r3 = r3.getEcpm()
            int r4 = r7.getEcpm()
            if (r3 < r4) goto L15
            return r0
        L41:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mS2SAdSourceList
            if (r1 == 0) goto L7d
            int r1 = r1.size()
            if (r1 <= 0) goto L7d
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r6.mS2SAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L51:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3
            if (r3 != 0) goto L60
            goto L51
        L60:
            java.lang.String r4 = "S2S"
            java.lang.String r5 = r3.getBiddingType()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L51
            int r4 = r3.getAdStatus()
            if (r4 != r2) goto L51
            int r3 = r3.getEcpm()
            int r4 = r7.getEcpm()
            if (r3 <= r4) goto L51
            return r0
        L7d:
            r7 = 1
            return r7
    }

    private boolean judgeIsContinueDispatchSamePriceAdSource(xyz.adscope.amps.model.config.response.AdSourceModel r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2e
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r4.mWFAdSourceList
            if (r1 != 0) goto L8
            goto L2e
        L8:
            int r5 = r5.getEcpm()
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r4.mWFAdSourceList
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            int r3 = r2.getEcpm()
            if (r5 != r3) goto L12
            int r2 = r2.getAdStatus()
            r3 = 6
            if (r2 == r3) goto L12
            return r0
        L2c:
            r5 = 1
            return r5
        L2e:
            return r0
    }

    private boolean judgeIsHasLoadingSuccessAdResource() {
            r4 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFSortAdSourceList
            r1 = 0
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L2a
        Lc:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mWFSortAdSourceList
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 != 0) goto L21
            goto L12
        L21:
            int r2 = r2.getAdStatus()
            r3 = 5
            if (r2 != r3) goto L12
            r0 = 1
            return r0
        L2a:
            return r1
    }

    private void sortAdSourceListByEcpm(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r4) {
            r3 = this;
            xyz.adscope.amps.control.dispatch.AMPSDispatcher$1 r0 = new xyz.adscope.amps.control.dispatch.AMPSDispatcher$1
            r0.<init>(r3)
            java.util.Collections.sort(r4, r0)
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r4.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " sortAdSourceListByEcpm mWeightRandomNum:"
            r1.append(r2)
            int r2 = r3.mWeightRandomNum
            r1.append(r2)
            java.lang.String r2 = ";getStartWeight:"
            r1.append(r2)
            int r2 = r0.getStartWeight()
            r1.append(r2)
            java.lang.String r2 = ";getEndWeight:"
            r1.append(r2)
            int r2 = r0.getEndWeight()
            r1.append(r2)
            java.lang.String r2 = ";getSeatId:"
            r1.append(r2)
            java.lang.String r0 = r0.getSeatId()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            goto Lc
        L55:
            return
    }

    @Override // xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface
    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> biddingTimeOut() {
            r4 = this;
            boolean r0 = r4.isDispatchWFSort
            r1 = 0
            if (r0 != 0) goto L2b
            int r0 = r4.mAdRequestType
            r2 = 1
            if (r0 == r2) goto Lb
            goto L2b
        Lb:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mS2SAdSourceList
            r3 = 6
            r4.updateAdSourceAdStatus(r0, r3)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mC2SAdSourceList
            r4.updateAdSourceAdStatus(r0, r3)
            r4.isDispatchWFSort = r2
            int r0 = r4.mAdRequestType
            r2 = 2
            if (r0 != r2) goto L1e
            return r1
        L1e:
            java.util.List r0 = r4.getWaitDispatchWFSortAdSourceList()
            if (r0 == 0) goto L2b
            int r2 = r0.size()
            if (r2 <= 0) goto L2b
            return r0
        L2b:
            return r1
    }

    @Override // xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface
    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> dispatch(xyz.adscope.amps.model.config.response.AdSourceModel r1) {
            r0 = this;
            java.util.List r1 = r0.dispatchAd(r1)
            r0.handleWFRaisePrice(r1)
            return r1
    }

    @Override // xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface
    public void updateAdSourceAdStatus(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L35
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L35
        L9:
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0
            if (r0 != 0) goto L1c
            goto Ld
        L1c:
            r1 = 6
            if (r5 == r1) goto L23
            r0.setAdStatus(r5)
            goto Ld
        L23:
            int r1 = r0.getAdStatus()
            r2 = 3
            if (r1 == r2) goto Ld
            int r1 = r0.getAdStatus()
            r2 = 5
            if (r1 == r2) goto Ld
            r0.setAdStatus(r5)
            goto Ld
        L35:
            return
    }
}
