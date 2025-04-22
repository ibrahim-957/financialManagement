package com.ibrahim.financeManagement.Core.Utilities.Mappers;

import com.ibrahim.financeManagement.Business.Requests.BudgetRequest;
import com.ibrahim.financeManagement.Business.Requests.CategoryRequest;
import com.ibrahim.financeManagement.Business.Requests.TransactionRequest;
import com.ibrahim.financeManagement.Entities.Concretes.Budget;
import com.ibrahim.financeManagement.Entities.Concretes.Category;
import com.ibrahim.financeManagement.Entities.Concretes.Transaction;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperManager implements IModelMapperService {

    private ModelMapper modelMapper = new ModelMapper();

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
