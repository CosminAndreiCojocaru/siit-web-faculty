package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.BatchDao;
import siit.model.Batch;

import java.util.List;

@Service
public class BatchService {

    @Autowired
    private BatchDao batchDao;

    public List<Batch> getBy(Integer id){
        return batchDao.getAllBatch(id);
    }

}
