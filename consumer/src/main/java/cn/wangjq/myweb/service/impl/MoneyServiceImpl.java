package cn.wangjq.myweb.service.impl;

import cn.wangjq.myweb.domain.SeataAccount;
import cn.wangjq.myweb.mapper.SeataAccountMapper;
import cn.wangjq.myweb.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private SeataAccountMapper seataAccountMapper;

    @Override
    public void reduceMoney(int reduceMoney, int id) {
        SeataAccount seataAccount = seataAccountMapper.selectById(id);
        seataAccount.setMoney(seataAccount.getMoney() - 5000);
        seataAccountMapper.updateById(seataAccount);

    }
}
