package xyz.adscope.amps.control.bid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSPriceComparator implements xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface {
    private int mAdRequestType;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mC2SAdSourceList;
    private xyz.adscope.amps.model.config.response.AdSourceModel mCandidateAdSourceModel;
    private java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> mRequestAdSourceDatas;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mS2SAdSourceList;
    private int mWeightRandomNum;
    private xyz.adscope.amps.model.config.response.AdSourceModel mWinAdSourceModel;


    public AMPSPriceComparator(xyz.adscope.amps.model.config.response.SpaceModel r3, java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mWeightRandomNum = r0
            r1 = 0
            r2.mS2SAdSourceList = r1
            r2.mC2SAdSourceList = r1
            r2.mAdRequestType = r0
            r2.mCandidateAdSourceModel = r1
            r2.mWinAdSourceModel = r1
            if (r3 != 0) goto L14
            return
        L14:
            int r0 = r3.getWeightRandomNum()
            r2.mWeightRandomNum = r0
            java.util.List r0 = r3.getS2sAdSourceList()
            r2.mS2SAdSourceList = r0
            java.util.List r0 = r3.getC2sAdSourceList()
            r2.mC2SAdSourceList = r0
            r2.mRequestAdSourceDatas = r4
            int r3 = r3.getBidDistributionMethod()
            r2.mAdRequestType = r3
            return
    }

    private int getBiddingSuccessCompareResult(xyz.adscope.amps.model.config.response.AdSourceModel r4) {
            r3 = this;
            r0 = 4
            if (r4 != 0) goto L4
            return r0
        L4:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r3.mCandidateAdSourceModel
            r2 = 2
            if (r1 != 0) goto La
            return r2
        La:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r3.getComparePriceWinAdSource(r1, r4)
            boolean r4 = r3.isSameAdSource(r4, r1)
            if (r4 == 0) goto L15
            return r2
        L15:
            return r0
    }

    private xyz.adscope.amps.model.config.response.AdSourceModel getComparePriceWinAdSource(xyz.adscope.amps.model.config.response.AdSourceModel r6, xyz.adscope.amps.model.config.response.AdSourceModel r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xyz.adscope.amps.model.config.response.SortAdSourceModel r1 = new xyz.adscope.amps.model.config.response.SortAdSourceModel
            int r2 = r6.getEcpm()
            r3 = 1
            r1.<init>(r6, r2, r3)
            r0.add(r1)
            int r1 = r5.getSecondPrice(r6)
            if (r1 <= 0) goto L20
            xyz.adscope.amps.model.config.response.SortAdSourceModel r2 = new xyz.adscope.amps.model.config.response.SortAdSourceModel
            r2.<init>(r6, r1, r3)
            r0.add(r2)
        L20:
            xyz.adscope.amps.model.config.response.SortAdSourceModel r1 = new xyz.adscope.amps.model.config.response.SortAdSourceModel
            int r2 = r7.getEcpm()
            r4 = 0
            r1.<init>(r7, r2, r4)
            r0.add(r1)
            int r1 = r5.getSecondPrice(r7)
            if (r1 <= 0) goto L3b
            xyz.adscope.amps.model.config.response.SortAdSourceModel r2 = new xyz.adscope.amps.model.config.response.SortAdSourceModel
            r2.<init>(r7, r1, r4)
            r0.add(r2)
        L3b:
            r5.sortAdSourceModel(r0)
            int r7 = r0.size()
            r1 = 2
            if (r7 != r1) goto L50
            java.lang.Object r6 = r0.get(r4)
            xyz.adscope.amps.model.config.response.SortAdSourceModel r6 = (xyz.adscope.amps.model.config.response.SortAdSourceModel) r6
            xyz.adscope.amps.model.config.response.AdSourceModel r6 = r6.getAdSourceModel()
            return r6
        L50:
            int r7 = r0.size()
            if (r7 <= r1) goto L96
            java.lang.Object r6 = r0.get(r4)
            xyz.adscope.amps.model.config.response.SortAdSourceModel r6 = (xyz.adscope.amps.model.config.response.SortAdSourceModel) r6
            xyz.adscope.amps.model.config.response.AdSourceModel r6 = r6.getAdSourceModel()
            java.lang.Object r7 = r0.get(r3)
            xyz.adscope.amps.model.config.response.SortAdSourceModel r7 = (xyz.adscope.amps.model.config.response.SortAdSourceModel) r7
            xyz.adscope.amps.model.config.response.AdSourceModel r7 = r7.getAdSourceModel()
            java.lang.Object r0 = r0.get(r1)
            xyz.adscope.amps.model.config.response.SortAdSourceModel r0 = (xyz.adscope.amps.model.config.response.SortAdSourceModel) r0
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r0.getAdSourceModel()
            boolean r1 = r5.isSameAdSource(r6, r7)
            if (r1 == 0) goto L84
            int r7 = r5.getSecondPrice(r0)
            if (r7 <= 0) goto L96
            r5.modifyAdSourceAuctionStrategy(r0, r7)
            return r6
        L84:
            int r0 = r5.getSecondPrice(r6)
            if (r0 <= 0) goto L8d
            r5.modifyAdSourceAuctionStrategy(r6, r0)
        L8d:
            int r0 = r5.getSecondPrice(r7)
            if (r0 <= 0) goto L96
            r5.modifyAdSourceAuctionStrategy(r7, r0)
        L96:
            return r6
    }

    private int getCycleQueueCompareResult(xyz.adscope.amps.model.config.response.AdSourceModel r9) {
            r8 = this;
            r0 = 4
            if (r9 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r8.mRequestAdSourceDatas
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "amps_log_tag"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r1.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 == 0) goto Le
            boolean r6 = r8.isSameAdSource(r2, r9)
            if (r6 == 0) goto L27
            goto Le
        L27:
            int r6 = r2.getAdStatus()
            r7 = 5
            if (r6 != r7) goto L3a
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r8.getComparePriceWinAdSource(r9, r2)
            boolean r2 = r8.isSameAdSource(r2, r9)
            if (r2 == 0) goto L39
            goto Le
        L39:
            return r0
        L3a:
            int r6 = r2.getAdStatus()
            if (r6 <= 0) goto Le
            int r6 = r2.getAdStatus()
            if (r6 > r0) goto Le
            int r6 = r2.getEcpm()
            int r7 = r9.getEcpm()
            if (r6 != r7) goto L5e
            boolean r6 = r9.isHitWeight()
            if (r6 == 0) goto L57
            goto Le
        L57:
            boolean r6 = r2.isHitWeight()
            if (r6 != 0) goto L5e
            goto Le
        L5e:
            int r6 = r8.mAdRequestType
            if (r6 != r5) goto L6d
            int r6 = r2.getEcpm()
            int r7 = r9.getEcpm()
            if (r6 >= r7) goto L6d
            goto Le
        L6d:
            int r6 = r8.mAdRequestType
            if (r6 != r4) goto L82
            boolean r4 = r8.isBidFinish()
            if (r4 == 0) goto L82
            int r4 = r2.getEcpm()
            int r6 = r9.getEcpm()
            if (r4 >= r6) goto L82
            goto Le
        L82:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "comparePrice wait channel:"
            r9.append(r0)
            java.lang.String r0 = r2.getSeatId()
            r9.append(r0)
            java.lang.String r0 = ",spaceId:"
            r9.append(r0)
            java.lang.String r0 = r2.getSpaceId()
            r9.append(r0)
            java.lang.String r0 = ",adStatus:"
            r9.append(r0)
            int r0 = r2.getAdStatus()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            xyz.adscope.amps.tool.AMPSLogUtil.d(r3, r9)
            return r5
        Lb3:
            int r0 = r8.mAdRequestType
            if (r0 == 0) goto Lb9
            if (r0 != r4) goto Lc5
        Lb9:
            boolean r0 = r8.isBidFinish()
            if (r0 != 0) goto Lc5
            java.lang.String r9 = "comparePrice wait bidding not finish:"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r3, r9)
            return r5
        Lc5:
            r8.mWinAdSourceModel = r9
            r9 = 3
            return r9
    }

    private int getSecondPrice(xyz.adscope.amps.model.config.response.AdSourceModel r5) {
            r4 = this;
            java.lang.String r0 = r5.getBiddingType()
            boolean r0 = r4.isC2SOrS2SAdSource(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r5.getAuctionStrategy()
            if (r0 != 0) goto L13
            return r1
        L13:
            boolean r2 = r0.isHit()
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r2 = r0.getIsLastLook()
            r3 = 1
            if (r2 == r3) goto L22
            return r1
        L22:
            int r0 = r0.getSecondPrice()
            if (r0 > 0) goto L29
            return r1
        L29:
            int r5 = r5.getEcpm()
            if (r0 > r5) goto L30
            return r1
        L30:
            return r0
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

    private boolean isSameAdSource(xyz.adscope.amps.model.config.response.AdSourceModel r3, xyz.adscope.amps.model.config.response.AdSourceModel r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            if (r4 != 0) goto L6
            goto L23
        L6:
            java.lang.String r3 = r3.getSpaceId()
            java.lang.String r4 = r4.getSpaceId()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L23
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1b
            goto L23
        L1b:
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L23
            r3 = 1
            return r3
        L23:
            return r0
    }

    private void modifyAdSourceAuctionStrategy(xyz.adscope.amps.model.config.response.AdSourceModel r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L15
            if (r3 > 0) goto L5
            goto L15
        L5:
            r2.setEcpm(r3)
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r2 = r2.getAuctionStrategy()
            if (r2 == 0) goto L15
            r0 = 1
            r2.setUseLastLook(r0)
            r2.setOriginEcpm(r3)
        L15:
            return
    }

    private void sortAdSourceModel(java.util.List<xyz.adscope.amps.model.config.response.SortAdSourceModel> r2) {
            r1 = this;
            if (r2 == 0) goto L11
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L11
        L9:
            xyz.adscope.amps.control.bid.AMPSPriceComparator$1 r0 = new xyz.adscope.amps.control.bid.AMPSPriceComparator$1
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
        L11:
            return
    }

    @Override // xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface
    public void comparePriceTimeout() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r1.mWinAdSourceModel
            if (r0 == 0) goto L5
            goto Lb
        L5:
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r1.mCandidateAdSourceModel
            if (r0 == 0) goto Lb
            r1.mWinAdSourceModel = r0
        Lb:
            return
    }

    @Override // xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface
    public int getComparePriceResult(xyz.adscope.amps.model.config.response.AdSourceModel r4) {
            r3 = this;
            r0 = 4
            if (r4 == 0) goto L58
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.mRequestAdSourceDatas
            if (r1 == 0) goto L58
            int r1 = r1.size()
            if (r1 != 0) goto Le
            goto L58
        Le:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r3.mWinAdSourceModel
            if (r1 == 0) goto L13
            return r0
        L13:
            int r1 = r4.getAdStatus()
            r2 = 3
            if (r1 != r2) goto L22
            r3.handleBiddingRaisePrice(r4)
            int r4 = r3.getBiddingSuccessCompareResult(r4)
            return r4
        L22:
            int r1 = r4.getAdStatus()
            r2 = 5
            if (r1 == r2) goto L2a
            return r0
        L2a:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r3.mCandidateAdSourceModel
            if (r1 != 0) goto L35
            r3.mCandidateAdSourceModel = r4
            int r4 = r3.getCycleQueueCompareResult(r4)
            return r4
        L35:
            boolean r1 = r3.isSameAdSource(r1, r4)
            if (r1 == 0) goto L42
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r3.mCandidateAdSourceModel
            int r4 = r3.getCycleQueueCompareResult(r4)
            return r4
        L42:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r3.mCandidateAdSourceModel
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r3.getComparePriceWinAdSource(r1, r4)
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r3.mCandidateAdSourceModel
            boolean r1 = r3.isSameAdSource(r4, r1)
            if (r1 == 0) goto L51
            return r0
        L51:
            r3.mCandidateAdSourceModel = r4
            int r4 = r3.getCycleQueueCompareResult(r4)
            return r4
        L58:
            return r0
    }

    @Override // xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface
    public xyz.adscope.amps.model.config.response.AdSourceModel getWinAdSourceModel() {
            r3 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r3.mWinAdSourceModel
            if (r0 == 0) goto L5
            return r0
        L5:
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r3.mCandidateAdSourceModel
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = r3.getCycleQueueCompareResult(r0)
            r2 = 3
            if (r0 != r2) goto L15
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r3.mWinAdSourceModel
            return r0
        L15:
            return r1
    }
}
