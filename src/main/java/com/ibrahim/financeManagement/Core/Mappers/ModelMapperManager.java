package com.ibrahim.financeManagement.Core.Mappers;

import com.ibrahim.financeManagement.Business.Requests.BudgetRequest;
import com.ibrahim.financeManagement.Business.Requests.CategoryRequest;
import com.ibrahim.financeManagement.Business.Requests.TransactionRequest;
import com.ibrahim.financeManagement.Entities.Concretes.Budget;
import com.ibrahim.financeManagement.Entities.Concretes.Category;
import com.ibrahim.financeManagement.Entities.Concretes.Transaction;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelMapperManager implements IModelMapperService {

    private ModelMapper modelMapper;

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        this.modelMapper.typeMap(CategoryRequest.class, Category.class)
                .addMappings(mapper -> mapper.skip(Category::setId));

        this.modelMapper.typeMap(TransactionRequest.class, Transaction.class)
                .addMappings(mapper -> mapper.skip(Transaction::setId));

        this.modelMapper.typeMap(BudgetRequest.class, Budget.class)
                .addMappings(mapper -> mapper.skip(Budget::setId));


        return this.modelMapper;
    }

    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return this.modelMapper;
    }
}
